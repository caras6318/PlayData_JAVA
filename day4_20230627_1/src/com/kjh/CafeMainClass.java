package com.kjh;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeDataClass cdc = new CafeDataClass();

		
		System.out.println("검색할 날을 입력해주세요");
		System.out.println("EX)1999-12-12");
		System.out.print("=>");
		Scanner scan = new Scanner(System.in);
		String date = scan.next();
		ArrayList<String> mostItem = CafeMethodClass.most(cdc.cafes, date);
		
		//CafePrintClass.prn(mostItem);
	}

}
