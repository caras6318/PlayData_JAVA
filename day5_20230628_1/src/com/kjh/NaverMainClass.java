package com.kjh;

public class NaverMainClass {

	public static void main(String[] args) {
		//(1)
		String uri = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day5_20230628_1/src/com/kjh/naver_news_stand_data.txt";
		NaverDataClass naver = new NaverDataClass(uri);
		
		
		System.out.println(naver.news.size());
		
		
		for(int i = 0; i < naver.news.size(); i++) {
			System.out.println(naver.news.get(i).image);
			System.out.println(naver.news.get(i).url);
		}
		
		//(3)
		String tags = NaverMethodClass.createHTML(naver.news);
		//(4)
		System.out.print(tags);
		String uri2 = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day5_20230628_1/src/com/kjh/naver_news_stand_data.html";
		NaverPrintClass.saveHTML(uri2, tags);
	}

}
