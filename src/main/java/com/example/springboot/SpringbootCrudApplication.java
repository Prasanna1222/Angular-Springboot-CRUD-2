package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan("com.example.springboot.entity")
public class SpringbootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudApplication.class, args);
	}

}
