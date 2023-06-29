package com.kjh;

import java.io.FileWriter;
import java.io.IOException;

public class WordPrintClass {

	// 기본 생성자 (외부에서 객체 생성 못하도록 private)
	private WordPrintClass() {
	}
	
	// 전달돤 파일 경로와 태그들을 이용하여 html 파일 생성
	public static void saveHTML(String uri_save, String tags) {
		FileWriter fw =null;
		try {
			fw = new FileWriter(uri_save);
			fw.write(tags);
			fw.close();
			
			System.out.println("HTML 생성 성공!!!");
		} catch (IOException e) {
			System.out.println("saveHTML() IO ERR =>" + e.getMessage());
		}
	} // saveHTML() END

}
