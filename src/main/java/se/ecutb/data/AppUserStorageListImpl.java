package se.ecutb.data;

import org.springframework.stereotype.Component;
import se.ecutb.model.AppUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component

public class AppUserStorageListImpl implements AppUserStorage {
    private List<AppUser> appUsers;
    public AppUserStorageListImpl(){
        this.appUsers = new ArrayList<>();
    }
    @Override
    public Optional<AppUser> findById(int appUserId) {
        return appUsers.stream().filter(user->user.getAppUserId()==appUserId).findFirst();
    }

    @Override
    public List<AppUser> findAll() {
        return null;
    }

    @Override
    public List<AppUser> findByFirstName(String firstName) {
        return appUsers.stream().filter(user->user.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
    }

    @Override
    public List<AppUser> findByLastName(String lastName) {
        return appUsers.stream().filter(user->user.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
    }

    @Override
    public Optional<AppUser> findByEmail(String email) {
        return appUsers.stream().filter(user->user.getEmail().equalsIgnoreCase(email)).findFirst();
    }

    @Override
    public AppUser creatNewAppUser(String firstName, String lastName, String email) {
        if(findByEmail(email).isPresent()){
            throw new IllegalArgumentException("Email"+email+"already exists");

        }
        AppUser user = new AppUser(firstName,lastName,email);
        appUsers.add(user);
        return user;
    }

    @Override
    public boolean deleteAppUser(int appUserId) {
        AppUser unluckyOne = findById(appUserId).orElseThrow(IllegalArgumentException::new);
       // return appUsers.remove(findById(appUserId).orElseThrow(IllegalArgumentException::new));
        return appUsers.remove(unluckyOne);
    }


}
