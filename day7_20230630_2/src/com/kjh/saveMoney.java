package com.kjh;

public class saveMoney {

	public saveMoney() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void saveMoney(int money) {
		try {
			Thread.sleep(3000);;
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.setMoney(this.money+money);
	}

}
