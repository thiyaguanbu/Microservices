package com.perfm.services.deptservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfm.services.model.Department;
import com.perfm.services.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		if(null!=department) {
			departmentRepository.save(department);
			return department;
		}
		return null;
	}

	@Override
	public Department findDepartmentById(Long id) {
		if(id!=null) {
			Department department = departmentRepository.findById(id).get();
			if(null!=department)
				return department;
			else
				return null;
		}
		return null;
	}

	@Override
	public List<Department> findDepartmentByOrganizationId(Long organizationId) {
		List<Department> departments = departmentRepository.findByOrganizationId(organizationId);
		return departments;
	}

	
}
