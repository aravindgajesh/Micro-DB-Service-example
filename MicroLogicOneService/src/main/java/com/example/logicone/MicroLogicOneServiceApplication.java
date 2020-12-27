package com.example.logicone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroLogicOneServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroLogicOneServiceApplication.class, args);
	}
	
	 @Bean
	  RestTemplate restTemplate() {
	      return new RestTemplate();
	  }

}
