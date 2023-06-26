package com.kjh;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc = new DataClass();
		
		int[] realPrice = MethodClass.realPrice(dc.books);
		PrintClass.prn(realPrice);
		
	}

}
