package com.kjh;

public class NotSyncMain {
	static Bank bank;
	public static void main(String[] args) {
		bank = new Bank(); //은행업무시작~
		
		System.out.print("current money : " + bank.getMoney());
		ME m = new ME();
		Wife w = new Wife();
		
		m.start();
		w.start();
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());{
		}
		// TODO Auto-generated method stub

		}
	}
}
