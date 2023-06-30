package com.kjh2;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {

	public ExcelReader() {
		// TODO Auto-generated constructor stub
	}
	public static void excelReader() {
		String uri = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day7_20230630_4/data.xlsx";
		
		
		File f = new File(uri);
		Workbook wb = null;
		
		try {
			wb = Workbook.getWorkbook(f);
			
			Sheet s = wb.getSheet(0);
			
			int n = 0;
			while(true) {//무한루프
				try {
					
					Cell c = s.getCell(0, n);
					System.out.println(c.getContents());
					n++;
					
				}catch(Exception e){
					break;
				}
					
				
			}
			
		} catch (BiffException e) { //엑셀문서 확장자 오류 예외처리
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		
		}
		
		
	}
}
