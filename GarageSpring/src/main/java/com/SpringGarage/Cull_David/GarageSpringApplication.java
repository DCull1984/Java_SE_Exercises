package com.SpringGarage.Cull_David;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GarageSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageSpringApplication.class, args);
	}
}
