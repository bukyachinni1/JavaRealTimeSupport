package com.java.developer.JavaRealTimeSupport.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.developer.JavaRealTimeSupport.managerImpl.EmployeeManagerImpl;
import com.java.developer.JavaRealTimeSupport.model.EmploeeModelResponse;
import com.java.developer.JavaRealTimeSupport.model.LabourDetails;

@Component
public class EmployeeServiceImpl {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeManagerImpl employeeManagerImpl;

	public EmploeeModelResponse getEmployeeDetails() {

		EmploeeModelResponse employeeDetails = employeeManagerImpl.getEmployeeDetails();
		return employeeDetails;
	}
	
	public List<LabourDetails> getEmployeeDetailsList() {

		List<LabourDetails> employeeDetails = employeeManagerImpl.getEmployeeDetailsList();
		return employeeDetails;
	}
	
	
	
}
