package com.perfm.services.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perfm.services.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
//	List<Employee> findByDepartmentId(Long departmentId);
//	List<Employee> findByOrganizationId(Long organizationId);

}
