package com.kjh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethodClass {

	public FileMethodClass() {
		// TODO Auto-generated constructor stub
	}
//	public static void filewrite(String url) throws IOException {
//		FileWriter fw = null;
//		fw = new FileWriter(url);
//	}비추천하는 방법
	
	public static void filewrite(String url){
		FileWriter fw = null;
		try {
			fw = new FileWriter(url);
			String text = "Test File";
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			System.out.println("FileWriter" + e.getMessage());
		} //FileWriter
	}
	public static void fileread(String url){
	FileReader fr = null;
	BufferedReader br = null;
	try {
		fr = new FileReader(url);
		br = new BufferedReader(fr);
		
		
		br.close();
		fr.close();
		
//	}catch (FileNotFoundException e) {
//		System.out.println("FileReader" + e.getMessage());
//		
//	}catch (IOException e) {
//		System.out.println("FileReader" + e.getMessage());
//		
//	}//FileReader 방법1
	}catch (Exception e) {
		System.out.println("FileReader" + e.getMessage());
		
	}	//방법2
	

	}

}