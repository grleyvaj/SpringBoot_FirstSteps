package cu.example;

import cu.example.service.IPersonaService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoWebApplication.class, args);
    }
}
