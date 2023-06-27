package com.kjh;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {
		// TODO Auto-generated constructor stub
	}
	public static void prn(ArrayList<Integer> realPrice) {
		for(int i=0; i < realPrice.size(); i++) {
			System.out.println(realPrice.get(i)/100);
		}
	}
	public static void prres(ArrayList<String> srcBook) {
		if(srcBook.size() >0) {
			for(int i=0; i < srcBook.size(); i++) {
				System.out.println(srcBook.get(i));
			}
		}else {
				System.out.println("Missing Title");
		}
	}
}
