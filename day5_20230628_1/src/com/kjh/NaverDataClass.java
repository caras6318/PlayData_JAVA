package com.kjh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NaverDataClass {

	ArrayList<NaverNewsClass> news = new ArrayList<NaverNewsClass>();// TODO Auto-generated constructor stub
	
	public NaverDataClass() {
	
	}
	public NaverDataClass(String uri) {
		this.NaverInitData(uri);
	}
//	>>파일읽기 : FileReader , BufferedReader
//	>>읽은 내용으로 NaverNewsClass객체 생성해서 
//	>>ArrayList에 추가 : ArrayList<NaverNewsClass> news
	public void NaverInitData(String uri){
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String temp = null;
			String[] split = null;
			
			while((temp = br.readLine())!= null) {
				
				split = temp.split("\", \"");
				news.add(new NaverNewsClass(split[1], split[2]));		
			}
			
			
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException ==============> "+ e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException ======================>" + e.getMessage());
		}
		
	}

}
