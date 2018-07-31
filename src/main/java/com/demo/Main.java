package com.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.interfaces.MessagingService;
import com.demo.model.Message;
import com.demo.services.MessagingServiceImp;
import com.demo.utils.Loader;

public class Main {
	
	private static final Logger logger = LoggerFactory.getLogger("com.demo");

	public static void main(String[] args) {
		
		
		Loader loader = new Loader();
		logger.info("Getting incoming messages....");
		List<Message> incomingMessages = loader.getIncomingMessages();
		logger.info("Got all incoming messages....");
		MessagingService messagingService = new MessagingServiceImp();
		logger.info("Preparing to process messages...");
		messagingService.processMessages(incomingMessages);
		
		
	}

}
