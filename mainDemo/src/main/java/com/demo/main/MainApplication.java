package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MainApplication {

	public RestTemplate restTemplate() {
		/* returning object of RestTemplate */
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	
}
