package com.kjh;

public class MemberClass {
	int a = 100;

	static int b = 20;
	
	public MemberClass() {
		System.out.println("MemberClass 생성자 호출");
	}
	public void test(int p) { //void 여부로 생성자인지메소드인지 구별한다 생성자는반환값이없다
		System.out.println("test() 메소드 호출 : " + p);
	}

}
