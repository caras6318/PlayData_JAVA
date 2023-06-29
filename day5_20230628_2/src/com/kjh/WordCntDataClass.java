package com.kjh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordCntDataClass {
	
	ArrayList<WrodCntClass> srcword = new ArrayList<WrodCntClass>();
//	ArrayList<WrodCntClass> cntword = new ArrayList<WrodCntClass>();
	ArrayList<WrodCntClass> bs = new ArrayList<WrodCntClass>();
	
	public WordCntDataClass() {
		
	}
	public WordCntDataClass(String url) {
		this.Baseinit(url);
	}
	public void Baseinit(String url) {
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(url);
			br = new BufferedReader(fr);
			
			
			String temp = null;
			String[] tmp = null;

			while((temp = br.readLine())!= null) {
//				System.out.print(temp);
				bs.add(new WrodCntClass(temp));
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

	
