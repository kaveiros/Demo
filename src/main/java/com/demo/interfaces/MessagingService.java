package com.demo.interfaces;

import java.util.List;

import com.demo.model.Message;

/**
 * Interface defining Messaging service methods
 * @author Nikolaos Chantzopoulos
 * @version 0.1
 * @since 07-29-2018
 */
public interface MessagingService {
	
	String processMessages(List<Message> messages);

}
