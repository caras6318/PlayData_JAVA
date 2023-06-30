package com.kjh;

public interface A {

	int a =10; //final이 붙은 상수로 선언된더이싱 값 변경이 불다
	// public void sum(){
	//
	// }//메서드 선언 불가
	
	public void sum();//메서드명은 선언 가능
	//이 interface를 구현받는 클래스는 반드시 해당 메소드를 재정의 해야한다.
	
	
	
}
