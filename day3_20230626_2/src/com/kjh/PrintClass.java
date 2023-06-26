package com.kjh;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}
	public static void prn(int[] realPrice) {
		for(int i=0; i < realPrice.length; i++) {
			System.out.println(realPrice[i]/100);
		}
	}
}
