package com.kjh;

import java.util.ArrayList;

//MethodClass : 프로젝트에 필요한 공통적인 메소드들만 보유하는 클래스
public class MethodClass {

	public MethodClass() { // 기본 생성자
		
	} 
	//MainClass 의 main()내에서 호출 
	//main()에서는 실제 데이터들을 보유한 members 배열을 전달 
	public static ArrayList<Integer> age(ArrayList<MemberClass> members){
		ArrayList<Integer> ages = new ArrayList<Integer>(members.size());
		for (int i = 0; i < members.size();i++) {
			String temp = members.get(i).getFirstNo().substring(0,2);
			String temp2 = members.get(i).getLastNo().substring(0,1);
			int temp3 = Integer.parseInt(temp);
			if(Integer.parseInt(temp2) <= 2) {
				ages.add(2023 - (1900 + temp3));
			}else {
				ages.add(2023 - (2000 + temp3));
			}
			
		}
		return ages;
	}
	public static int grade(ArrayList<StudentClass> students){
		int grades = 0;
		for (int i = 0; i < students.size();i++) {
			grades += students.get(i).Grade;
		}
		return grades;
	}
}