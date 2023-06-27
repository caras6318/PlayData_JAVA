package com.kjh;

import java.util.ArrayList;

public class MethodClass {

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Integer> realPrice(ArrayList<BookClass> books) {
	
		ArrayList<Integer> realPrice = new ArrayList<Integer>();
		for(int i = 0;i < books.size(); i++) {
			realPrice.add(books.get(i).price * (100 - books.get(i).dc));
		}
		
		return realPrice;
	}
	public static ArrayList<String> srcBook(ArrayList<BookClass> books, String inAuthor){
		ArrayList<String> srcBookName = new ArrayList<String>();
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).author.contains(inAuthor)) {
				srcBookName.add(books.get(i).title);
			}
		}
		return srcBookName;
	}

}
