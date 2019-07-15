package com.perfm.services.empservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perfm.services.model.Employee;

@Service
public interface EmployeeService {
	
	List<Employee> findAllEmployee();
	Employee findEmployeeById(Integer id);
	Employee saveEmployee(Employee emp);
	List<Employee> findByDepartment(Long departmentId);
	List<Employee> findByOrganization(Long organizationId);

}
