package com.java.developer.JavaRealTimeSupport.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.developer.JavaRealTimeSupport.managerImpl.JavaManagerImpl;
import com.java.developer.JavaRealTimeSupport.service.JavaService;

@Component
public class JavaServiceImpl implements JavaService{
	
	private static final Logger logger=LoggerFactory.getLogger(JavaServiceImpl.class);
	
	@Autowired
	JavaManagerImpl managerImpl;

	public String getJavaVersion() {
		logger.info("Entering into JavaServiceImpl layer  :::: ");
		String response=managerImpl.getJavaVersion();
		return response;
	}
	
}
