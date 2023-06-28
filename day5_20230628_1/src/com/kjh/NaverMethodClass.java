package com.kjh;

import java.util.ArrayList;

public class NaverMethodClass {

	public NaverMethodClass() {
		// TODO Auto-generated constructor stub
	}
	public static String createHTML(ArrayList<NaverNewsClass> news) {
		String tags = "";
		tags = tags + "<html>";
		tags = tags + "<head><title>NAVER</title></head>";
		tags = tags + "<body>";
		tags = tags + "<table>";
		for(int i = 0; i < news.size();i+=5) {
				tags = tags + "<tr>";
			for(int j = 0; j<5;j++) {
				
				tags = tags + "<td>";
				tags = tags + "<a href=\"https://" + news.get(i+j).url +"\">";
				tags = tags + "<img src=\"/Users/caras/Downloads/newsstand_data/newsImages/" + news.get(i+j).image +"\">";
				tags = tags + "</a>";
				tags = tags + "</td>";
				
			}
			
			tags = tags + "</tr>";
		}

		
		tags = tags + "</table>";
		tags = tags + "</body>";
		tags = tags + "</html>";
		return tags;
	}
}
