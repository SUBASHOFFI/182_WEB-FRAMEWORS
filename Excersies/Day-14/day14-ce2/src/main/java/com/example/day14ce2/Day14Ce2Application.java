package com.example.day14ce2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@OpenAPIDefinition(
		info =@Info(
				title = "Book",
				version = "1.1.2",
				description = "Book Details",
				contact = @Contact
				(
						name = "DHARANEESH",
						email = "727722EUIT039@gmail.com"
						)
				)
		)



@SpringBootApplication
public class Day14Ce2Application {

	public static void main(String[] args) {
		SpringApplication.run(Day14Ce2Application.class, args);
	}

}
