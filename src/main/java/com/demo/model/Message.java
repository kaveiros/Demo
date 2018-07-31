package com.demo.model;

/**
 * Class representing a Message
 * @author Nikos Chantzopoulos
 * @since 27-29-2018
 * @version 0.1
 *
 */
public class Message {
	
	private String productName;
	
	private int quantity;
	
	private double price;
	
	private String buySell;

	public Message(String productName, int quantity, double price, String buySell) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.buySell = buySell;
	}

	public Message() {
		// empty
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getBuySel() {
		return buySell;
	}

	public void setBuySel(String buySel) {
		this.buySell = buySel;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBuySell() {
		return buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	@Override
	public String toString() {
		
		return String.format("Product name : %s, quantity: %d, price: %s, sell or buy: %s", productName, quantity, String.valueOf(price), buySell);
	}	
	
	
	

}
