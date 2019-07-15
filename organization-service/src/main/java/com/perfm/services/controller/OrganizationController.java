package com.perfm.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perfm.services.client.DepartmentClient;
import com.perfm.services.model.Organization;
import com.perfm.services.orgservices.OrganizationService;

@RestController
@RequestMapping(value="/organization")
public class OrganizationController {
	
	@Autowired
	OrganizationService organizationService;
	
	@Autowired
	DepartmentClient departmentClient;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces="application/json")
	public Organization findOrganizationById(@PathVariable("id") Long id) {
		Organization org = organizationService.findByOrganizationId(id);
		return org;
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET,produces="application/json")
	public List<Organization> getAllOrganization() {
		List<Organization> orgList = organizationService.findall();
		return orgList;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	public Organization saveOrganization(@RequestBody Organization organization) {
		Organization org = organizationService.save(organization);
		return org;
	}
	
	@RequestMapping(value="/{id}/department",method=RequestMethod.GET,produces="application/json")
	public Organization findOrgwithDepartment(@PathVariable("id") Long id) {
		Organization organization = organizationService.findByOrganizationId(id);
		organization.setDepartments(departmentClient.findOrganizationwithEmployees(id));
		return organization;
	}
	
	@GetMapping("/departmentPort")
	public Integer getPort() {
		return departmentClient.getPort();
	}
	
}
