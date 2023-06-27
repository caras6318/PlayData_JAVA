package com.kjh;

public class BookClass {
	
	String title = null; 	//책이름
	String author = null; 	//저자
	String press = null; 	//출판사
	int price = 0;	 		//정가
	String image = null; 	//책표
	int dc = 0; 			//할인율 
	
	public BookClass() {
		System.out.println("BookClass생성자 호출 확인용");
	}
	//books[0] = new BookClass("DO it HTML 5 CSS 3", "고경희", "이지스퍼블리싱", 16800, "06365234.jpg", 20);
	public BookClass(String title, String author, String press, int price, String image, int dc){
		
		
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
		this.image = image;
		this.dc = dc;
	}

}
