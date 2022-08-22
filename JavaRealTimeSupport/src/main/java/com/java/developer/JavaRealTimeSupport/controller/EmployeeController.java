package com.java.developer.JavaRealTimeSupport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.developer.JavaRealTimeSupport.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping(value = "/get/employee")
public class EmployeeController {
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired(required = true)
	EmployeeServiceImpl impl=new EmployeeServiceImpl();
	
	
	@GetMapping(value = "/details", produces="application/json")
	public ResponseEntity<String> getJavaDetails() {
		logger.info("Entering into JavaExampleController layer  :::: ");
		String resp=impl.getEmployeeDetails();
		return new ResponseEntity<String>(resp,HttpStatus.OK);

	}
	

}
