package com.perfm.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perfm.services.client.EmployeeClient;
import com.perfm.services.deptservices.DepartmentService;
import com.perfm.services.model.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	EmployeeClient employeeClient;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces="application/json")
	public Department findDepartmentDetailsById(@PathVariable("id") Long id) {
		Department department = departmentService.findDepartmentById(id);
		return department;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	public Department saveDepartmentDetails(@RequestBody Department department) {
		Department dept = departmentService.saveDepartment(department);
		return dept;
	}
	
	@RequestMapping(value="/organization/{organizationId}",method=RequestMethod.GET,produces="application/json" )
	public List<Department> findOrganizationwithEmployees(@PathVariable("organizationId") Long organizationId){
		
		List<Department> departments = departmentService.findDepartmentByOrganizationId(organizationId);
		departments.forEach(d -> d.setEmployees(employeeClient.findByDepartment(d.getId())));
		return departments;
	}
	
	
	
	
	
	
}
