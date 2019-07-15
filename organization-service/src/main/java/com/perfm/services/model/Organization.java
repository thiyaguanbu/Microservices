package com.perfm.services.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="table_organization")
public class Organization {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;
//	private Long employeeId;
//	private Long departmentId;
	@Transient
	private List<Department> departments = new ArrayList<>();
	@Transient
	private List<Employee> employees = new ArrayList<>();
	
	
	
//	public Long getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(Long employeeId) {
//		this.employeeId = employeeId;
//	}
//	public Long getDepartmentId() {
//		return departmentId;
//	}
//	public void setDepartmentId(Long departmentId) {
//		this.departmentId = departmentId;
//	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Organization(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", address=" + address + ", departments=" + departments
				+ ", employees=" + employees + "]";
	}

	
}
