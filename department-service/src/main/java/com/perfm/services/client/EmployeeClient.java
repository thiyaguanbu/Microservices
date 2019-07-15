package com.perfm.services.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.perfm.services.model.Employee;



@FeignClient(name="employee-management-service")
public interface EmployeeClient {

	@GetMapping("/employee/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
