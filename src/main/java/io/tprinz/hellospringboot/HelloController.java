package io.tprinz.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class HelloController {

        @GetMapping("/")
        public String index() {
                System.out.println("Queried the REST endpoint");

                String mysql_user = System.getenv("MYSQL_USER");
                System.out.println("MYSQL_USER : " + mysql_user);

                return "Greetings from Spring Boot!";
        }

}
