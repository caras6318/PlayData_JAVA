package com.kjh;

public class CafeClass {
	
	private String order_id = null;
	private String orderDate = null;
	private String category = null;
	private String item = null;
	private int price = 0;
	
	public CafeClass() {
		// TODO Auto-generated constructor stub
	}
	public CafeClass(String order_id, String orderDate, String category, String item, int price) {
		
		this.order_id = order_id;
		this.orderDate = orderDate;
		this.category = category;
		this.item = item;
		this.price = price;
		
	}
	public String getOrderDate() {
		return orderDate;
	}
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
}
