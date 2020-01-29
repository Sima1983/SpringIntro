package se.ecutb.data;

import se.ecutb.model.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserStorage {
    Optional<AppUser> findById(int appUserId);
    List<AppUser>findAll();
    List<AppUser>findByFirstName(String firstName);
    List<AppUser>findByLastName(String lastName);
    Optional<AppUser> findByEmail(String email);
    AppUser creatNewAppUser(String firstName,String lastName,String email);
    boolean deleteAppUser(int appUserId);
}
