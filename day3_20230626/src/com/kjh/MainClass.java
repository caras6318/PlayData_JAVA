package com.kjh;

public class MainClass {

	static String s = "sss";
	
	public static void main(String[] args) {
		
		MemberClass m1 = new MemberClass();
		
		Object m2 = new MemberClass();
		
		MemberClass m3 = (MemberClass) m2; //조상타입은자손타입에 들어갈수 없다.
		
		System.out.println(s);
//		
//		m1.a = 1000;
//		
//		m1.test(m1.a);
//		m3.test(m3.a);
//		
//		// TODO Auto-generated method stub
//		System.out.println(m1.a + " " + m3.a);
//		
//		m1.b = 20000;
//		
//		System.out.println(m1.b + " " + m3.b);
		MemberClass.b = 214748374;
		System.out.println(m1.b + " " + m3.b);

	}
}
