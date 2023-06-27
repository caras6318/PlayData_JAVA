package com.kjh;

import java.util.ArrayList;

public class NewsMethodClass {

	public NewsMethodClass() {
	
	}
	public static ArrayList<String> srcNewsURL(ArrayList<NewsClass> news, String press) {
		
		ArrayList<String> url = new ArrayList<String>();
		
		for (int i = 0; i < news.size(); i++ ) {
//			if(press.equals(news.get(i).press)) {
//				url = news.get(i).url; 완전히 일치할때만 출력
//			}
			if(news.get(i).press.contains(press)){ //내가이렵력한press가 news.press 데이터 안에 포함되어있는지 
				url.add(news.get(i).url);
			}
		}
		
		
		return url;
	}
	public static ArrayList<String> rmv(ArrayList<NewsClass> news) {
		ArrayList<String> c = new ArrayList<String>();
		String temp = "";
		for ( int idx= 0; idx <news.size();idx++ ) {
			if(!(temp.equals(news.get(idx).category))) {
				temp = news.get(idx).category;
				c.add(temp);
			}
		}
		return c;
	}
	
	
}