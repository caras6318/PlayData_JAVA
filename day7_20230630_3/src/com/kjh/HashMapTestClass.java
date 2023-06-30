package com.kjh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTestClass {
//public class HashMap Implements Map{}
	public HashMapTestClass() {
		// TODO Auto-generated constructor stub
	}
	public static void hashMapTest() {
		Map<String, Integer > map = new HashMap<String,Integer>();
		HashMap<String, Integer > map2 = new HashMap<String,Integer>();
		
		//데이터 추가 : put(Key : Value);
		map.put("a", 10);
		map.put("a", 20);
		map.put("a", 30);
		
		map.put("b", 20);
		map.put("c", 30);
		
		System.out.println(map.size());
		
		//데이터 추출 : get(key name)
		System.out.println(map.get("c"));
		
		//HashMap의 키 이름들만 추출 : keyset()
		//반환 타입은 set<키에 대한 데이터 타입>
		Set<String> set = map.keySet();
		//1. LinkedList 형태로 바꾸어 추출
		List<String> list = new LinkedList<String>(set);//생성자에게 set객체를 전달
		for(String s : list) {
			System.out.println(s);
		}
		
		//2.Iterator형태로 변환해서 출력
		Iterator <String> iter = set.iterator();
		while(iter.hasNext()) { //iter.hsaNext() : 추출할 데이터가 있는지 확인
			System.out.println(iter.next());//데이터를 실제로 추출
		}
		//System.out.println(map.get("c"));
		public static void HashMapStudent{
			Student s1 = new Student(10, "test1");
		}
	}
	
}
