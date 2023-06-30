package com.kjh;

public class TVContribution {
	
	static Account account;
	
	public static void main (String[] args){
		
		Customer c1 = new Customer(Account,"031-1111-1111");
		Customer c2 = new Customer(Account,"031-2222-2222");
		Customer c3 = new Customer(Account,"031-3333-3333");
		
	}
	try {
		c1.join();
		c2.join();
		c3.join();
		
		c1.start();
		c2.start();
		c3.start();
	}catch(InterruptedExeption e) {
		System.out.print(e.getMessage());
	}
	System.out.println("total : " + account.getTotal());

}
