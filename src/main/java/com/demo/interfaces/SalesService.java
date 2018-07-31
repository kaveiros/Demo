package com.demo.interfaces;

import java.util.List;

import com.demo.model.Message;

/**
 * Interface defining Sale Service methods.
 * @author Nikolaos Chantzopoulos
 * @since 29-07-2018
 * @version 0.1
 */

public interface SalesService {

	String sell(Message message);
	
	String buy(Message message);
	
	void report(List<Message> messages);
	
	double calculatePrice(Message message);
	
}
