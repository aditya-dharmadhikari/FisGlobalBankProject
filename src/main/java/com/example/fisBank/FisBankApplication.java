package com.example.fisBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FisBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisBankApplication.class, args);
	}

}
