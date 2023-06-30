package com.kjh;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTestClass {

	public HashSetTestClass() {
		// TODO Auto-generated constructor stub
	}
	public static void hashSetTest() {
		HashSet<String> set = new HashSet<String>();
		set.add("s");
		set.add("d");
		set.add("s");
		set.add("a");
		
		System.out.print(set.size());
		
		//전체데이터 추출 : Iterator 로 변환 <== Set.iterator()
		Iterator<String>
		iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
		
		}

}
