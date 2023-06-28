package com.kjh;

import java.io.FileWriter;
import java.io.IOException;

public class NaverPrintClass {

	public NaverPrintClass() {
		// TODO Auto-generated constructor stub
	}
	public static void saveHTML(String uri, String tags) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(uri);
			fw.write(tags);
		}catch(IOException e) {
			System.out.println("Save HTML() =========>"+ e.getMessage());
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				System.out.println("Save HTML() finally=========>"+ e.getMessage());
			}
		}
	}

}
