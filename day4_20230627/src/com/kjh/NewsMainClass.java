package com.kjh;

import java.util.ArrayList;
//import java.util.Scanner;

public class NewsMainClass {

	public static void main(String[] args) {
//		ArrayList<NewsClass> a = new ArrayList<NewsClass>();//cmd + shift + o  => import 단축
//		NewsClass n = new NewsClass();
//		
//		a.add(n);
//		a.add(n);
//		a.add(n);
//		a.add(n);
//		a.add(n);
//		System.out.println(a.size());
//		a.remove(0);
//		System.out.println(a.size());
//
//		
//		NewsClass b = a.remove(0);//제거된 인덱스를 리턴해주는 역할을 하기도함
//		
//		a.set(1,n); // 1번 자료를 n으로 변경
//		
//		NewsClass c = a.get(3);
//		
//		a.clear();
//		System.out.println(a.size());
//		
		NewsDataClass ndc = new NewsDataClass();
//		System.out.println(ndc.news.size());
//		System.out.println(ndc.news.get(94).category);
//		
		//콘솔로부터 입력받기
		
		//System.out.print("검색할 신문사 입력 : ");
		//Scanner scan = new Scanner(System.in);
		//String press = scan.next();
		
//		//ArrayList<String> url = NewsMethodClass.srcNewsURL(ndc.news, press);
		ArrayList<String> rmvc = NewsMethodClass.rmv(ndc.news);
		//NewsPrintClass.printURL(press, url);
		NewsPrintClass.printrmv(rmvc);
		

	}
}
