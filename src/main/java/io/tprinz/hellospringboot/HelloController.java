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

                String mysql_password = System.getenv("MYSQL_PASSWORD");
                System.out.println("MYSQL_PASSWORD : " + mysql_password);

                String mysql_database = System.getenv("MYSQL_DATABASE");
                System.out.println("MYSQL_DATABASE : " + mysql_database);

                String mysql_service_host = System.getenv("MYSQL_SERVICE_HOST");
                System.out.println("MYSQL_SERVICE_HOST : " + mysql_service_host);

                String mysql_service_port = System.getenv("MYSQL_SERVICE_PORT");
                System.out.println("MYSQL_SERVICE_PORT : " + mysql_service_port);

                return "Greetings from Spring Boot!";
        }

}
