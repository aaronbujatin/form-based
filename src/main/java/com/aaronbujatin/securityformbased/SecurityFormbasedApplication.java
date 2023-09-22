package com.aaronbujatin.securityformbased;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("http://localhost:8100")
public class SecurityFormbasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityFormbasedApplication.class, args);
	}

}
