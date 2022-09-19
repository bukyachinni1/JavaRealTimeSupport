package com.java.developer.JavaRealTimeSupport.managerImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.developer.JavaRealTimeSupport.model.EmploeeModelResponse;
import com.java.developer.JavaRealTimeSupport.model.LabourDetails;

@Service
public class EmployeeManagerImpl {

	public EmploeeModelResponse getEmployeeDetails() {
		EmploeeModelResponse emploeeModelResponse = getEmploeeModelResponse();
		return emploeeModelResponse;
	}
	public EmploeeModelResponse getEmploeeModelResponse() {

		EmploeeModelResponse emploeeModelResponse = new EmploeeModelResponse();
		emploeeModelResponse.setEmpId("12345");
		emploeeModelResponse.setFirstName("Tarun");
		emploeeModelResponse.setLastName("Baddula");
		emploeeModelResponse.setFatherName("Krishna");
		emploeeModelResponse.setSal("10000/-");
		emploeeModelResponse.setAddress("KPHB");
		return emploeeModelResponse;

	}
	
	public List<LabourDetails> getEmployeeDetailsList() {
		List<LabourDetails> labourDetails = new ArrayList<>();
		LabourDetails labourDetails2 = new LabourDetails();
		
		List<EmploeeModelResponse> emploeeModelResponse = getEmploeeModelResponseList();
		
		for (EmploeeModelResponse emploeeModelResponse2 : emploeeModelResponse) {
			labourDetails2.setLabourId(emploeeModelResponse2.getEmpId());
			labourDetails2.setLabourFirstName(emploeeModelResponse2.getFirstName());
			labourDetails2.setLabourLastName(emploeeModelResponse2.getLastName());
			labourDetails2.setLabourSal(emploeeModelResponse2.getSal());
			labourDetails2.setLabourFatherName(emploeeModelResponse2.getFatherName());
			labourDetails2.setLabourAddress(emploeeModelResponse2.getAddress());
			labourDetails.add(labourDetails2);
			
		}
		
		return labourDetails;
	}
	
	public List<EmploeeModelResponse> getEmploeeModelResponseList() {
		
		List<EmploeeModelResponse>  emploeeModelResponsesList=new ArrayList<EmploeeModelResponse>();
		
		EmploeeModelResponse emploeeModelResponse = new EmploeeModelResponse();
		emploeeModelResponse.setEmpId("12345");
		emploeeModelResponse.setFirstName("Tarun");
		emploeeModelResponse.setLastName("Baddula");
		emploeeModelResponse.setFatherName("Krishna");
		emploeeModelResponse.setSal("10000/-");
		emploeeModelResponse.setAddress("KPHB");
		
		EmploeeModelResponse emploeeModelResponse1 = new EmploeeModelResponse();
		emploeeModelResponse1.setEmpId("123");
		emploeeModelResponse1.setFirstName("Chinni");
		emploeeModelResponse1.setLastName("Bukya");
		emploeeModelResponse1.setFatherName("Veera");
		emploeeModelResponse1.setSal("500/-");
		emploeeModelResponse1.setAddress("Khammam");
		
		emploeeModelResponsesList.add(emploeeModelResponse);
		emploeeModelResponsesList.add(emploeeModelResponse1);
		return emploeeModelResponsesList;

	}
	
	
}
