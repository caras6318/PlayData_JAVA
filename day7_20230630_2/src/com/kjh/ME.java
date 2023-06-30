package com.kjh;

public class ME extends Thread {

	public ME() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		NotSyncMain.bank.saveMoney(5000);
		System.out.print("After Input money : " + NotSyncMain.bank.getMoney());
	}
	

}
