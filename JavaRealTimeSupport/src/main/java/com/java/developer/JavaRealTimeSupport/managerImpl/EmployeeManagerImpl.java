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
	
	public List<EmploeeModelResponse> getEmployeeDetailsList() {
		List<EmploeeModelResponse> emploeeModelResponse = getEmploeeModelResponseList();
		return emploeeModelResponse;
	}
	
	public List<EmploeeModelResponse> getEmploeeModelResponseList() {
		
		List<EmploeeModelResponse>  emploeeModelResponses=new ArrayList<>();

		EmploeeModelResponse emploeeModelResponse1 = new EmploeeModelResponse();
		emploeeModelResponse1.setEmpId("850000");
		emploeeModelResponse1.setFirstName("sam");
		emploeeModelResponse1.setLastName("naga");
		emploeeModelResponse1.setFatherName("tarun");
		emploeeModelResponse1.setSal("10000/-");
		emploeeModelResponse1.setAddress("KPHB");
		
		EmploeeModelResponse emploeeModelResponse = new EmploeeModelResponse();
		emploeeModelResponse.setEmpId("98666");
		emploeeModelResponse.setFirstName("krishna");
		emploeeModelResponse.setLastName("prince");
		emploeeModelResponse.setFatherName("cheyi");
		emploeeModelResponse.setSal("2000/-");
		emploeeModelResponse.setAddress("Khammam");
		

		EmploeeModelResponse emploeeModelResponse2 = new EmploeeModelResponse();
		emploeeModelResponse2.setEmpId("785654");
		emploeeModelResponse2.setFirstName("praneeth");
		emploeeModelResponse2.setLastName("naga sai");
		emploeeModelResponse2.setFatherName("nagas");
		emploeeModelResponse2.setSal("30000/-");
		emploeeModelResponse2.setAddress("by pass r");
		
		emploeeModelResponses.add(emploeeModelResponse1);
		emploeeModelResponses.add(emploeeModelResponse);
		emploeeModelResponses.add(emploeeModelResponse2);
		return emploeeModelResponses;

	}
	public EmploeeModelResponse getEmploeeModelResponse2() {
		EmploeeModelResponse emploeeModelResponse2 = new EmploeeModelResponse();
		emploeeModelResponse2.setEmpId("852220");
		emploeeModelResponse2.setFirstName("paneeth");
		emploeeModelResponse2.setLastName("tarun");
		emploeeModelResponse2.setFatherName("naga");
		emploeeModelResponse2.setSal("20000/-");
		emploeeModelResponse2.setAddress("KPHB");
		return emploeeModelResponse2;

	}
	
	public List<LabourDetails> getLabourDetailsList() {
		List<LabourDetails> labourDetails=new ArrayList<>();
		LabourDetails details=new LabourDetails();
		List<EmploeeModelResponse> emploeeModelResponse = getEmploeeModelResponseList();
		for (EmploeeModelResponse emploeeModelResponse2 : emploeeModelResponse) {
			details.setLabourId(emploeeModelResponse2.getEmpId());
			details.setLabourFirstName(emploeeModelResponse2.getFirstName());
			details.setLabourLastName(emploeeModelResponse2.getLastName());
			details.setLabourFatherName(emploeeModelResponse2.getFatherName());
			details.setLabourAddress(emploeeModelResponse2.getAddress());
			details.setLabourSal(emploeeModelResponse2.getSal());
			labourDetails.add(details);
		}
		
		
		return labourDetails;
	}
	
	
public List<EmploeeModelResponse> getLabourModelResponseDetails() {
		
		List<EmploeeModelResponse>  emploeeModelResponses=new ArrayList<>();

		EmploeeModelResponse emploeeModelResponse1 = new EmploeeModelResponse();
		emploeeModelResponse1.setEmpId("850000");
		emploeeModelResponse1.setFirstName("sam");
		emploeeModelResponse1.setLastName("naga");
		emploeeModelResponse1.setFatherName("tarun");
		emploeeModelResponse1.setSal("10000/-");
		emploeeModelResponse1.setAddress("KPHB");
		
		EmploeeModelResponse emploeeModelResponse = new EmploeeModelResponse();
		emploeeModelResponse.setEmpId("98666");
		emploeeModelResponse.setFirstName("krishna");
		emploeeModelResponse.setLastName("prince");
		emploeeModelResponse.setFatherName("cheyi");
		emploeeModelResponse.setSal("2000/-");
		emploeeModelResponse.setAddress("Khammam");
		

		EmploeeModelResponse emploeeModelResponse2 = new EmploeeModelResponse();
		emploeeModelResponse2.setEmpId("785654");
		emploeeModelResponse2.setFirstName("praneeth");
		emploeeModelResponse2.setLastName("naga sai");
		emploeeModelResponse2.setFatherName("nagas");
		emploeeModelResponse2.setSal("30000/-");
		emploeeModelResponse2.setAddress("by pass r");
		
		emploeeModelResponses.add(emploeeModelResponse1);
		emploeeModelResponses.add(emploeeModelResponse);
		emploeeModelResponses.add(emploeeModelResponse2);
		return emploeeModelResponses;

	}
	
	
	
}
