package com.example.mentaplataformas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MentaPlataformasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentaPlataformasApplication.class, args);
	}

}
