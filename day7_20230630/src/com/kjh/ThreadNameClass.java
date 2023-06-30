package com.kjh;

public class ThreadNameClass extends Thread{

	public ThreadNameClass() {
	
		// TODO Auto-generated constructor stub
	}
	public ThreadNameClass(String name) {
		super(name);
	}
	public void run() {
		//스레드가 해야할 
		int i = 0;
		while(i<200) {
			System.out.println(getName() + "--------->" + i);
			i++;}
	}

}
