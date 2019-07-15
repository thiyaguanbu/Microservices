package com.perfm.services.empservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfm.services.model.Employee;
import com.perfm.services.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		Employee emp = employeeRepo.findById(id).get();
			return emp;
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByOrganization(Long organizationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
