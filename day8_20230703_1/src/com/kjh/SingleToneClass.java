package com.kjh;

public class SingleToneClass {
	public static SingleToneClass single = null;
//싱글톤 : 자바 디자인 패턴중 대표적인 패턴
	// 하나의 어플리케이션에 단 하나의 객체만 존재하도록 설계하는 패턴
	//1. 객체 저장 변수는 static 을 이용해사 공유 객체로 선언
	//2.생성자는 반드시 private으로 선언하여 외부에서 객체 생성하지 못하도록한다
	//3. public 메소드를 이용해서 생성된 객체를 반환 받는다
	
	
	public SingleToneClass() {
	}
		
		public static SingleToneClass getInstance() {
			single = new SingleToneClass();
			
		
		
	}

}
