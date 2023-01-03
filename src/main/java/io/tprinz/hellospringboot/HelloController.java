package io.tprinz.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class HelloController {

        @GetMapping("/")
        public String index() {
                System.out.println("Queried the REST endpoing");
                return "Greetings from Spring Boot!";
        }

}
