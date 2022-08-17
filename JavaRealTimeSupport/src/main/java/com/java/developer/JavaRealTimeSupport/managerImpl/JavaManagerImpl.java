package com.java.developer.JavaRealTimeSupport.managerImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.developer.JavaRealTimeSupport.DaoImpl.JavaDAOImpl;
import com.java.developer.JavaRealTimeSupport.manager.JavaManager;
import com.java.developer.JavaRealTimeSupport.serviceImpl.JavaServiceImpl;

@Service
public class JavaManagerImpl implements JavaManager{
	
	private static final Logger logger=LoggerFactory.getLogger(JavaManagerImpl.class);
	
	@Autowired
	JavaDAOImpl daoImpl;

	public String getJavaVersion() {
		logger.info("Entering into JavaManagerImpl layer  :::: ");
		String response=daoImpl.getJavaVersion();
		return response;
				
	}

}
