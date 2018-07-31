package com.demo.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.demo.exceptions.DemoException;
import com.demo.model.Message;
import com.demo.services.MessagingServiceImp;
import com.demo.services.SalesServiceImpl;
import com.demo.utils.Loader;

/**
 * Test class for the methods of Demo application
 * This is to ensure proper functionality of the methods.
 * Look at README.md for running these tests.
 * @author Nikolaos Chantzopoulos
 * version 0.1
 * @since 07-29-2018
 */
public class DemoTest {
	
	private SalesServiceImpl salesServiceImpl;
	private MessagingServiceImp messagingServiceImp;
	private Message message;
	private Message message2;
	private Message message3;
	private Message message4;
	List<Message> messages;
	
	@Before
	public void init() {
		salesServiceImpl = new SalesServiceImpl();
		messagingServiceImp = new MessagingServiceImp();
		message = new Message("Banana", 1, 12, "Sell");
		message2 = new Message("Carot", 20, 20, "Buy");
		message3 = new Message("Carot", 20, 0.0, "Buy");
		message4 = new Message("Carot", 20, 17.23, "Sell");
		messages = new ArrayList<>();
		messages.add(message);
		messages.add(message2);
		messages.add(message4);
		
	}
	
	@Test
	public void testUtil() {
	
		Loader loader = new Loader();
		assertEquals(loader.getIncomingMessages().size(), 55);
		
	}
	
	@Test
	public void testMessagingService() {
		
		String processMessages = messagingServiceImp.processMessages(messages);
		assertEquals(processMessages, "Total number of processed messages : 3");
		
	}
	
	@Test
	public void testSaleServicesell() {
		assertEquals(salesServiceImpl.sell(message2), "Sold items 1");
	}
	
	@Test
	public void testSaleServicebuy() {
		assertEquals(salesServiceImpl.buy(message2), "Bought items 1");
	}
	
	@Test(expected = DemoException.class)
	public void testCalculatePrice() throws DemoException{

		salesServiceImpl.calculatePrice(message3);
		
	}
	

	public void testCalculatePrice2(){

		double calculatedPrice = salesServiceImpl.calculatePrice(message);
		assertEquals(calculatedPrice, 12.0, 0);
	}
	
}
