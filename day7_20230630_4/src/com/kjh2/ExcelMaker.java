package com.kjh2;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelMaker {
/*엑셀파일 생성 및 데이터 추가*/
	public ExcelMaker() {
		// TODO Auto-generated constructor stub
	}

	public static void excelmaker() {
		String uri = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day7_20230630_4/data.xlsx";
		
		//1.File 객체의 생성자를 이용해서 파일 경로를 전달 File.class : java.io
		File f = new File(uri);
		
		//2.쓰기용도의 엑셀 문서객체(WorkBook) 생성 : jxl.jar
		WritableWorkbook wb = null; //없는 파일 읽어오기때문에 writable
		
		try {
			wb = Workbook.createWorkbook(f); //엑셀문서
			WritableSheet s =wb.createSheet("first", 0);//createSheet ( 시트명 / 인덱스 번호 )
			
			//1. 텍스트 : Label => new Label(열, 행, 글씨);
			//2. s.addCell(Label)
			for (int n = 0; n < 10; n++) {
				Label label = new Label(0, n, "Data" + n);
				s.addCell(label);
			}
			
			wb.write();  //	실제로 작성 
			wb.close();	// 저장후 종료 
			
			
		} catch (IOException e) {					//	외부파일에 접근가능한지 아닌지	
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		
		} catch (RowsExceededException e) {			// 행에 셀을 추가가능한지아닌지
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (WriteException e) {				// 작성이 가능한지 아닌지
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
