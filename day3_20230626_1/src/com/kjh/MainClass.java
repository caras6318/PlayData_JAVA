package com.kjh;

public class MainClass {
	//MainClass : 프로젝트 전체를 컨트롤하는 역할, 여러개로 나누어져있는 클래스들을 통합 관리 할 예정
	//Controller 역할  
	public static void main(String[] args) {
		//실제 데이터들은 dc객체 안의 members라는 배열이 소유
		
		DataClass dc = new DataClass();
		//MethodClass mc = new MethodClass();
		
		int[] ages = MethodClass.age(dc.members);
		for(int i=0; i < ages.length;i++) {
			System.out.println(ages[i]);
			
		}
		
	}
}