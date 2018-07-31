package com.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.exceptions.DemoException;
import com.demo.interfaces.SalesService;
import com.demo.model.Message;

/**
 * Sales service interface implementation class.
 * @author Nikolaos Chantzopoulos
 * @version 0.1
 * @since 07-29-2018
 *
 */
public class SalesServiceImpl implements SalesService {

	Logger logger = LoggerFactory.getLogger("com.demo");

	private List<Message> boughtItems = new ArrayList<>();

	private List<Message> soldItems = new ArrayList<>();

	private double totalBought = 0.0;

	private double totalSold = 0.0;

	@Override
	public String sell(Message message) {

		soldItems.add(message);
		totalSold = totalSold + calculatePrice(message);
		String items = String.format("Sold items %s", soldItems.size());
		logger.info(items);
		return items;
	}

	@Override
	public String buy(Message message) {

		boughtItems.add(message);
		totalBought = totalBought + calculatePrice(message);
		String items = String.format("Bought items %s", boughtItems.size());
		logger.info(items);
		return items;
		
	}

	public double calculatePrice(Message message) {

		if(message.getPrice() == 0.0 ) {
			throw new DemoException("The product price cannot be empty");
		}
		Double price = message.getPrice() * message.getQuantity();
		return price;

	}

	@Override
	public void report(List<Message> messages) {

		double total = 0.0;
		total = totalBought - totalSold;

		logger.info("================Report=============");
		logger.info("Total bought items: {} of total value : {}", boughtItems.size(), String.valueOf(totalBought));
		logger.info("Total sold items: {} of total value : {}", soldItems.size(), String.valueOf(totalSold));
		logger.info("Total : {}", String.valueOf(total));
		logger.info("============End of Report=============");

	}

}
