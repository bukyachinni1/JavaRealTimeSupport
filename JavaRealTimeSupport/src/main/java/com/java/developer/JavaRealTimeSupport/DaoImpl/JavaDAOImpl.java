package com.java.developer.JavaRealTimeSupport.DaoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.java.developer.JavaRealTimeSupport.Dao.JavaDAO;

@Service
public class JavaDAOImpl implements JavaDAO {
	
	private static final Logger logger=LoggerFactory.getLogger(JavaDAOImpl.class);

	public String getJavaVersion() {
		
		logger.info("Entering into JavaDAOImpl layer  :::: ");
		
		logger.info("Returning the response from JavaDAOImpl layer  :::: ");
		
		String response="Java Version 1.8 ::: ";
		
		return response;
		
		
		
	}

}
