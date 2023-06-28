package com.kjh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CafeMethodClass {

	public CafeMethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<String> most(ArrayList<CafeClass> cafes, String date){
		
		ArrayList<String> most = new ArrayList<String>();
		for(int idx = 0; idx < cafes.size(); idx++) {
			if(cafes.get(idx).getOrderDate().contains(date)) {
				most.add(cafes.get(idx).getItem());
			}
		}
		HashMap<Integer,String> mostI = new HashMap <Integer , String>();
		
		for(int i = 0;i < cafes.size(); i++ ) {
//			mostI.put(Collections.frequency(cafes, cafes.get(i).getItem()), cafes.get(i).getItem());
			//System.out.println(cafes.get(i).getPrice());
			System.out.print(Collections.frequency(cafes, cafes.get(i).getPrice()));
		}
		
		return most;
		
	}
	
}
