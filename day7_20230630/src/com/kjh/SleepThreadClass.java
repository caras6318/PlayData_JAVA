package com.kjh;

public class SleepThreadClass extends Thread{

	public SleepThreadClass() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("sleep start =================");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
//				System.out.println(e.getMessage());
		}
	}

}
