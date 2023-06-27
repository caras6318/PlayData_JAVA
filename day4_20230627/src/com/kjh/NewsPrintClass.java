package com.kjh;

import java.util.ArrayList;

public class NewsPrintClass {

	public NewsPrintClass() {
		// TODO Auto-generated constructor stub
	}
	public static void printURL(String press, ArrayList<String> url) {
		for(int i=0; i < url.size(); i++) {
			System.out.println(press + " 의 링크주소 : https://" + url.get(i));
		}
	}
	public static void printrmv(ArrayList<String> rmvc) {
		for(int i=0; i < rmvc.size(); i++) {
			System.out.println(rmvc.get(i));
		}
	}
}
