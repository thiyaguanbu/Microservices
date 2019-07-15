package com.perfm.services.client;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.perfm.services.model.Department;

@FeignClient(name="department-service")
@RibbonClient(name="department-service")
public interface DepartmentClient {
	
	@RequestMapping(value="/department/{id}",method=RequestMethod.GET,produces="application/json")
	public Department findDepartmentDetailsById(@PathVariable("id") Long id);

	
	@RequestMapping(value="/department/organization/{organizationId}",method=RequestMethod.GET,produces="application/json" )
	public List<Department> findOrganizationwithEmployees(@PathVariable("organizationId") Long organizationId);
	
	
	@GetMapping("/department/departmentPort")
	public Integer getPort();
	
}
