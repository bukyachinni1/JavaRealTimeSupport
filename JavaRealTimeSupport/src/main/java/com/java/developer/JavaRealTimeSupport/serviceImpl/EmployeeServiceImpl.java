package com.java.developer.JavaRealTimeSupport.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.developer.JavaRealTimeSupport.managerImpl.EmployeeManagerImpl;
import com.java.developer.JavaRealTimeSupport.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	private static final Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	
	@Autowired
	EmployeeManagerImpl employeeManagerImpl;

	public String getEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeManagerImpl.getEmployeeDetails();
	}
}


