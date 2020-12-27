package com.example.dbservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbservice.service.EmployeeService;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/getEmployeeName")
	public String getEmployeeName() {
		return employeeService.getEmployeeName();
	}
}
