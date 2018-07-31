package com.demo.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.interfaces.MessagingService;
import com.demo.interfaces.SalesService;
import com.demo.model.Message;

/**
 * Messaging service implementation class.
 * @author Nikolaos Chantzopoulos
 * @since 07-29-2018
 * @version 0.1
 *
 */
public class MessagingServiceImp implements MessagingService {
	
	private static final Logger logger = LoggerFactory.getLogger("com.demo");

	/**
	 * Method processing messages.
	 * @param List<Message> list of messages.
	 * @return A string indicating that processing has finished.
	 */
	public String processMessages(List<Message> messages) {
		
		SalesService salesService = new SalesServiceImpl();
		int reportCounter = 0;
		int counter = 0;
		for (Message m : messages) {
			
			counter++;
			reportCounter++;
			if(counter == 50) {
				
				logger.info("The application has received 50 messages. Will now pause....");
				return "";
			}
			logger.info("Got message , the content is : ");
			logger.info(m.toString());
			if (m.getBuySel().equalsIgnoreCase("Buy")) {
				salesService.buy(m);
			}
			else {
				salesService.sell(m);
			}
			if (reportCounter==10) {
				
				salesService.report(messages);
				reportCounter =0;
				
			}
		}
		
		String processMessage = String.format("Total number of processed messages : %s", messages.size());
		logger.info(processMessage);
		return processMessage;

	}
	

}
