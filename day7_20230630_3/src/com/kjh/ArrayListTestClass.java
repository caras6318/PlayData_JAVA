package com.kjh;

import java.util.ArrayList;

public class ArrayListTestClass {

	public ArrayListTestClass() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("d");
		list.add("e");
		
		//특정 위치를 지정해서 추가할 경우
		list.add(1, "d"); // 끼워넣기 생각하면 편함 기존의 것들은뒤로 밀음
		//특정 위치의 데이터를 다른 데이터로변경
		list.set(2, "yy");
		//특정 위치의 데이터를 제거
		list.remove(0);
		//특정 위치의 데이터를 제거하고 리턴받기 - 빈자리 메움기
		String result = list.remove(0);
		//특정데이터의 인덱스 번호를 알고 싶을 경우
		int idx = list.indexOf("yy");
		//특정데이터의 인덱스 번호를 알고 싶을 경우 2
				int ix = list.indexOf("yy");
		//전체 데이터를탐색하는 방법
				for(int i = 0; i < list.size(); i++){
					System.out.println(list.get(i));
				}
					System.out.println("ㅓ=======================================================================");
				for(String w:list) {
					System.out.println(list);
				}
	}

}
