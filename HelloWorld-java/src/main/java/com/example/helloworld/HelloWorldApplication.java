//This file starts the Spring Boot application.

import org.springframework.boot.SpringApplication; //used to start the Spring Boot application
import org.springframework.boot.autoconfigure.SpringBootApplication; //used to enable auto-configuration and component scanning

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
