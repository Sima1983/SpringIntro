package se.ecutb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.ecutb.Config.AppConfig;
import se.ecutb.data.AppUserStorage;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
       // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
       // AppUserStorage storage = context.getBean(AppUserStorage.class);
      //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //  AppUserStorage storage = context.getBean(/*"appUserStorage",*/AppUserStorage.class);
      //  System.out.println(storage.creatNewAppUser("Nisse","Nys","Nisse@gmail.com"));

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        AppUserStorage sotarge = context.getBean(AppUserStorage.class);
        System.out.println(sotarge.creatNewAppUser("nisse","nys","nisse@gmail.com"));
    }
}
