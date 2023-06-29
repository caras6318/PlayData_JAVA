package com.kjh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class WordMethodClass {

	// 기본 생성자 (외부에서 객체 생성 못하도록 private)
	private WordMethodClass() { 
	}
	
	// 전체 문서를 줄단위로 저장.
	public static void readSentence(String uri){
		FileReader fr =null;
		BufferedReader br=null;
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String temp=null;
			while((temp=br.readLine()) != null) {
				WordDataClass.sentence.add(temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("readSentence() FileNotFound ERR =>" + e.getMessage());
		} catch (IOException e) {
			System.out.println("readSentence() IO ERR =>" + e.getMessage());
		}
		
	} // readSentence() END

	// 검색할 단어들을 저장.
	public static void readWord(String uri){
		FileReader fr =null;
		BufferedReader br=null;
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String temp=null;
			while((temp=br.readLine()) != null) {
				WordDataClass.words.add(new WordCountClass(temp));
			}
		} catch (FileNotFoundException e) {
			System.out.println("readSentence() FileNotFound ERR =>" + e.getMessage());
		} catch (IOException e) {
			System.out.println("readSentence() IO ERR =>" + e.getMessage());
		}		
		
	} // readWord() END
	
	// 줄단위 저장된 문장을 분리하여 저장
	public static void splitSentence() {
		String[] temp;
		for(String onLine : WordDataClass.sentence) {
			temp =onLine.split(" ");
			WordDataClass.splitSentence.add(new SentenceSplitClass(temp));
		}
	} // splitSentence() END
	
	// 문장 별로 분리된  전체 데이터를  검색 
	public static void repeatWordCount() {
		for(SentenceSplitClass sentence : WordDataClass.splitSentence) {
			searchWordCount(sentence.splitSentence);
		}
	} // repeatWordCount() END
	
	// repeatWordCount() 부터 분리된 하나의 문장에 
	// 각 검색단어가 있는 지 확인하여 카운트
	public static void searchWordCount(String[] splitSentence) {
		for(String sentence : splitSentence) {
			for(WordCountClass word : WordDataClass.words) {
				if(sentence.contains(word.word)) {
					word.count++;
				}
			} // inner for() END
		} // outer for() END
	} // searchWordCount() END
	
	// 각 단어 카운트 값을 이용하여 tag 생성
	public static String createHTML() {
		String tags="";
		tags = tags + "<html>";
		tags = tags + "<head><title>Word Count</title></head>";
		tags = tags + "<body>";
		tags = tags + "<table>";
		
		tags = tags + "<caption>검색 단어의 노출횟수 시각화</caption>";
		tags = tags + "<colgroup  style='text-align:center;'>";
		tags = tags + "<col style='width: 10%;'>";
		tags = tags + "<col style='width: 10%;'>";
		tags = tags + "<col style='width: 80%;'>";
		tags = tags + "</colgroup>";
		
		tags = tags + "<thead>";
		tags = tags + "<tr>";
		tags = tags + "<th>검색 단어</th>";
		tags = tags + "<th>노출 횟수</th>";
		tags = tags + "<th>시각화</th>";
		tags = tags + "</tr>";
		tags = tags + "</thead>";
		
		tags = tags + "<tbody>";
		
		String hashTag = ".";
		for(WordCountClass word : WordDataClass.words) {
			tags = tags + "<tr>";
			
			tags = tags + "<td>";
			tags = tags + word.word;
			tags = tags + "</td>";
			
			tags = tags + "<td>";
			tags = tags + word.count;
			tags = tags + "</td>";
			
			tags = tags + "<td>";
			for(int n=0; n<word.count; n++) {
				tags = tags + hashTag ;
			}
			tags = tags + "</td>";
			
			tags = tags + "</tr>";
		}
		
		tags = tags + "</tbody>";
		tags = tags + "</table>";
		tags = tags + "</body>";
		tags = tags + "</html>";
		
		return tags;
	}
}








