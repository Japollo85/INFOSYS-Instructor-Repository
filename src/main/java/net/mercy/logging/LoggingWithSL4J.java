package net.mercy.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingWithSL4J {
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
		logger.info("Hello World");
		
		Wombat w = new Wombat();
		w.setTemperature(new Integer(40));
	}
	

}
