package br.gabrieelmoura.swapi;

import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class DesafioB2WApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioB2WApplication.class, args);
    }

}
