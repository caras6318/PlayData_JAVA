package com.kjh;

import java.io.IOException;

import com.kjh.util.Utility;

public class CocktailsMain {

	public static void main(String[] args) throws IOException {
		
		System.out.print("DB불러오는중");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		Utility.initializeMenu();

	}

}
