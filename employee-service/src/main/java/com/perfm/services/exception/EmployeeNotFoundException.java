package com.perfm.services.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(Integer id){
		super("Requested product with Id:"+id+" is not found");
	}
}
