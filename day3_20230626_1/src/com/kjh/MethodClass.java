package com.kjh;

//MethodClass : 프로젝트에 필요한 공통적인 메소드들만 보유하는 클래스
public class MethodClass {

	public MethodClass() { // 기본 생성자
		
	} 
	//MainClass 의 main()내에서 호출 
	//main()에서는 실제 데이터들을 보유한 members 배열을 전달 
	public static int[] age(MemberClass[] members){
		int[] ages = new int[members.length];
		for (int i = 0; i < members.length;i++) {
			String temp = members[i].firstNo.substring(0,2);
			String temp2 = members[i].lastNo.substring(0,1);
			int temp3 = Integer.parseInt(temp);
			if(Integer.parseInt(temp2) <= 2) {
				ages[i] = 2023 - (1900 + temp3);
			}else {
				ages[i] = 2023 - (2000 + temp3);
			}
			
		}
		return ages;
	}
	public static int grade(StudentClass[] students) {
		int grades = 0;
		for (int i = 0; i < students.length;i++) {
			grades += students[i].Grade;
		}
		return grades;
	}
}