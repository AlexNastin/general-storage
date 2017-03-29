package by.dt.userstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("by.dt")
public class UserStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserStorageApplication.class, args);
	}
}
