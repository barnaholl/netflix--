package com.codecool.videoproviderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VideoproviderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoproviderserviceApplication.class, args);
	}

}
