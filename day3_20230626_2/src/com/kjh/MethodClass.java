package com.kjh;

public class MethodClass {

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static int[] realPrice(BookClass[] books) {
	
		int[] realPrice = new int[books.length];
		for(int i = 0;i < books.length; i++) {
			realPrice[i] = books[i].price * (100 - books[i].dc);
		}
		
		return realPrice;
	}

}
