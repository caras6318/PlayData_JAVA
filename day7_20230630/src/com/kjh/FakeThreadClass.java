package com.kjh;

public class FakeThreadClass {

	public FakeThreadClass() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		int i = 0;
		while(i<200) {
			System.out.println( "--------->" + i);
			i++;}
	
	}
	public void start() {
		run();
	}
}
