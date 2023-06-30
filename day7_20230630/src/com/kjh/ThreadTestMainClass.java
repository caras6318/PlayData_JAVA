package com.kjh;

public class ThreadTestMainClass {

	public static void main(String[] args) {
		System.out.println("main()시작");
		
//1.extends ThreadTestClass
//		ThreadNameClass t1 = new ThreadNameClass("t1");
//		ThreadNameClass t2 = new ThreadNameClass("t2");
//		ThreadNameClass t3 = new ThreadNameClass("t3");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//		}catch(InterruptedException e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println("main()종료");

		
//2.Fake		
//		FakeThreadClass t1 = new FakeThreadClass();
//		FakeThreadClass t2 = new FakeThreadClass();
//		FakeThreadClass t3 = new FakeThreadClass();
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	
		
//3.Implements Runnable test{
//	SleepThreadClass s = new SleepThreadClass();
//	s.start();
//		
//	}
		
	}

}
