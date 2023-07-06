	package com.freeflux.bootcamp;

import com.freeflux.bootcamp.util.Utility;

public class BootCampMain {
	
	/** Controller **/
	public static void main(String[] args) {
		System.out.println("지금 앱 준비 중 입니다. 2초만 기다려 주세요~~");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		Utility.initializeMenu();
		
	} // main() END

}
