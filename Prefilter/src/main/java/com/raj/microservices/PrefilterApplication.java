package com.raj.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PrefilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrefilterApplication.class, args);
	}

}
