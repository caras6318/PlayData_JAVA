package com.kjh.lsp;

import com.kjh.srp.Person;
import com.kjh.srp.Programmer;
import com.kjh.srp.PM;

//Lsp 적용 ( Person / Programmer / PM)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Programmer(); //extends Person
		Person p2 = new PM(); //extends Person
		//UpCasting
		
		p1.work(); //부모클래스 타입으로 저장 받아도 자식 클래스느느 work() 매서드 사용가능
		p2.work(); //부모클래스 타입으로 저장 받아도 자식 클래스느느 work() 매서드 사용가능
		
		Object p3 = new PM();
		p3.work(); //사용불가
		
		//1.부모클래스 타입으로 형변환
		Person p4 = (Person)p3; //Down Casting
		p4.work();
		//2. 본인클래스 타입으로 형변환
		PM p5  = (PM)p3;
		p5.work();
		
	}
	
	//설꼐시 주의 사항
	//자식 클래스의 멤버(필드)변수는 선언하지 않는다
	//부모클래스는 자식 클래스의 멤버*

}
