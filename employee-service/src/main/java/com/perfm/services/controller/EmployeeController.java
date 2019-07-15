package com.perfm.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perfm.services.empservices.EmployeeService;
import com.perfm.services.model.Employee;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(value = "/{id}", method= RequestMethod.GET, produces = "application/json")
	public Employee findById(@PathVariable("id") Integer id) {
		return employeeService.findEmployeeById(id);
	}

}
