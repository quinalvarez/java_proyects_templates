package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Api${AppName}Application {

    public static void main(String[] args) {
        SpringApplication.run(Api${AppName}Application.class, args);
    }
}