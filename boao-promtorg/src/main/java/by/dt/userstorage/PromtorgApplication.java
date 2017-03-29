package by.dt.userstorage;

import by.dt.userstorage.config.DBConfig;
import by.dt.userstorage.config.RabbitMQConfig;
import by.dt.userstorage.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("by.dt")
@Import({DBConfig.class, RabbitMQConfig.class, WebConfig.class})
public class PromtorgApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromtorgApplication.class, args);
    }
}
