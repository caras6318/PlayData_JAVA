package com.kjh;

public class WordMainClass {

	public static void main(String[] args) {
		String uri_word ="c:/filetest/검색단어리스트.txt";
		String uri_doc ="c:/filetest/하둡 분산 처리 파일 시스템.txt";
		
		WordMethodClass.readWord(uri_word);
		WordMethodClass.readSentence(uri_doc);
		WordMethodClass.splitSentence();

		System.out.println(WordDataClass.sentence.size());		// 1298개 문장
		System.out.println(WordDataClass.words.size()); 		// 19개 단어
		System.out.println(WordDataClass.splitSentence.size());  // 1298개 문장 분리
		
		WordMethodClass.repeatWordCount();
		for(WordCountClass w : WordDataClass.words) {
			System.out.print(w.word + "\t");
			System.out.println(w.count);
		}
		
		String tags = WordMethodClass.createHTML();
		
		String uri_save = "c:/filetest/wordcount.html";
		WordPrintClass.saveHTML(uri_save, tags);
	}

}
