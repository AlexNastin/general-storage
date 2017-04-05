package by.dt.boaopromtorg;

import by.dt.boaopromtorg.config.DBConfig;
import by.dt.boaopromtorg.config.RabbitMQConfig;
import by.dt.boaopromtorg.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("by.dt")
@Import({DBConfig.class, RabbitMQConfig.class, WebConfig.class, SwaggerConfig.class})
public class PromtorgApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromtorgApplication.class, args);
    }
}
