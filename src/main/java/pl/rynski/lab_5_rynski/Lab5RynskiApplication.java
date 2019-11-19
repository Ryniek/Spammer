package pl.rynski.lab_5_rynski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class Lab5RynskiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab5RynskiApplication.class, args);
    }


}
