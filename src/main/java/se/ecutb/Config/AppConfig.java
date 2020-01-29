package se.ecutb.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.ecutb.data.AppUserStorage;
import se.ecutb.data.AppUserStorageListImpl;

@ComponentScan("se.ecutb")
@Configuration
public class AppConfig {
    @Bean(name = "list_storage")
    public AppUserStorage appUserStorage(){
        return new AppUserStorageListImpl();
    }

}
