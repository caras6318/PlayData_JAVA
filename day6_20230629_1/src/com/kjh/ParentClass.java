package com.kjh;

public class ParentClass {

	
	int a = 10;
	protected String name = "kjh";
	private boolean b = false;
	public char c = 'A';
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	
	public ParentClass(int n) {
		this .a = n;
		
		System.out.print("ParentClass생성자 종료");
	}

	//Object.class의 toStrin()을 재정의 : override
	public String toString() {
		String res = a + " * " + name;
		return res;
	}
}
