package com.kjh;

public class NaverNewsClass {

	String press = null;
	String image = null;
	String url = null;
	String category = null;
	
	public NaverNewsClass() {
		// TODO Auto-generated constructor stub
	}
	
	public NaverNewsClass(String press, String image, String url, String category) {
		this.press = press;
		this.image = image;
		this.url = url;
		this.category = category;
	}
	public NaverNewsClass(String split1,String split2) {
		this.image = split1;
		this.url = split2;
	}

}
