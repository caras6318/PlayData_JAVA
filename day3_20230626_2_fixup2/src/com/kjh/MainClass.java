package com.kjh;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc = new DataClass();
		
		ArrayList<Integer> realPrice = MethodClass.realPrice(dc.books);
		PrintClass.prn(realPrice);
		
		System.out.print("Please Enter Author :");
		Scanner scan = new Scanner(System.in);
		String inAuthor = scan.next();
		
		ArrayList<String> srcBook = MethodClass.srcBook(dc.books, inAuthor);
		PrintClass.prres(srcBook);
	}

}