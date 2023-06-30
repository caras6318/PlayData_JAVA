package com.kjh;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class hashSetLotto {

	public hashSetLotto() {
		// TODO Auto-generated constructor stub
	}
	public static void hashSetLotto() {
		HashSet<Integer> lotto = new HashSet<Integer>();
		//lotto.size <== 0
	
	
	/*
	 * 임의의수 6개 추출해서 저장
	 * 번호 45개
	 * 임의의 : Math.random(): (0~1)사이의 실수
	 * 		  Random.class nexint(범위)
	 * 		  nextInt(3) : 0 , 1 , 2
	 * 	 	  nextInt(10) : 0 , 1 , 2, 3 , 4, 5, 6, 7, 8, 9
	 * 
	 * 
	 * (int)Math.random() * 45 + 1
	 */
		Random r = new Random();
		for(int n = 0; lotto.size() < 6; n++) {
			int lottoNum = r.nextInt(45);
			lotto.add(new Integer(lottoNum + 1)); // 오류가 아니라 상위버전에서는 삭제될 가능성이있다 
		}
		
		List<Integer> lottoList = new LinkedList<Integer>(lotto);
		
	}
}