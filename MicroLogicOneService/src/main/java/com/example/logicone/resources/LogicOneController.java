package com.example.logicone.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LogicOneController {
	 @Autowired
	  private RestTemplate restTemplate;
	 
	@GetMapping(value = "/logiconeget")
	public String getEmployee() {
		String name = restTemplate.getForObject("http://localhost:8301/getEmployeeName", String.class);
		return name;
	}
}
