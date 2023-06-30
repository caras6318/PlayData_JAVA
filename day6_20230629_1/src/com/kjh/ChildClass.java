package com.kjh;

public class ChildClass extends ParentClass {

	public ChildClass() {
//		System.out.print("test"));
		super(1000); //부모클래스의 생성자에게 값을 전달 super위에는 다른 코드가 들어가면 안됨
		System.out.print("ChildClass생성자 종료");
		
	}

}
