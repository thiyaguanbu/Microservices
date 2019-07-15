package com.perfm.services.deptservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perfm.services.model.Department;

@Service
public interface DepartmentService {
	
	Department saveDepartment(Department department);
	Department findDepartmentById(Long id);
	List<Department> findDepartmentByOrganizationId(Long organizationId);

}
