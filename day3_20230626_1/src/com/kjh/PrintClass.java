package com.kjh;

//PrintClass : 출력에 해당하는 메소드들만 보유하는 클래스
//나중에 html과 같은 GUI/UI툴로 대체
//View 역할
public class PrintClass {

	public PrintClass() { // 기본생성
		// TODO Auto-generated constructor stub
	} 
	public void prn(int[] ages) { // 사용자 정의 메소드
		
		for(int i=0; i < ages.length;i++) {
			System.out.println(ages[i]);
			
		}
		
	}

}