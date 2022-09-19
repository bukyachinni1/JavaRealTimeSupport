package com.java.developer.JavaRealTimeSupport.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.developer.JavaRealTimeSupport.model.EmploeeModelResponse;
import com.java.developer.JavaRealTimeSupport.model.LabourDetails;
import com.java.developer.JavaRealTimeSupport.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping(value = "/get/employee")
public class EmployeeController {

	@Autowired(required = true)
	EmployeeServiceImpl impl;

	@GetMapping(value = "/emp/details", produces = "application/json")
	public ResponseEntity<EmploeeModelResponse> getEmpDetails() {
		EmploeeModelResponse resp = impl.getEmployeeDetails();
		return new ResponseEntity<EmploeeModelResponse>(resp, HttpStatus.OK);

	}
	
	@GetMapping(value = "/labour/details", produces = "application/json")
	public ResponseEntity<List<LabourDetails>> getLabourList() {
		List<LabourDetails> resp =impl.getEmployeeDetailsList();
		return new ResponseEntity<List<LabourDetails>>(resp, HttpStatus.OK);

	}


}
