package com.xworkz.commonmodule.utility;

import org.apache.log4j.Logger;

public class MailSenderLogger {
	
	static Logger logger;

	static {
		logger = Logger.getLogger("MailSender");
	}

	public static void main(String[] args) {
		logger.debug("Hello");
		logger.debug("Rakshi");
		demo();
	}
	public static void demo() {
		logger.trace("trace");
		logger.warn("warning");
		logger.info("information");
		logger.debug("trace");
		logger.trace("trace");
		logger.trace("trace");
	}

}
