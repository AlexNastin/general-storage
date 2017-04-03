package by.dt.userstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("by.dt")
@Import(value = SwaggerConfig.class)
public class UserStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserStorageApplication.class, args);
	}
}
