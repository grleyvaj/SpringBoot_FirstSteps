package cu.example;

import cu.example.service.IPersonaService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConsoleApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(DemoConsoleApplication.class);
    @Autowired
    private IPersonaService service;

    public static void main(String[] args){
        SpringApplication.run(DemoConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Saludo");
        service.registrar("Gloria");
    }
}
