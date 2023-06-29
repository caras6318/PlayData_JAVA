package com.kjh;

import java.util.ArrayList;

public class WordDataClass {
	
	/** 
	 * 클래스명으로 접근 가능하도록 static 
	 * 한번 선언하면 더이상 수정할 수 없도록 final
	 */
	static final ArrayList<String> sentence = new ArrayList<String>();								// 줄단위 문장 
	static final ArrayList<WordCountClass> words = new ArrayList<WordCountClass>();					// 검색 단어
	static final ArrayList<SentenceSplitClass> splitSentence = new ArrayList<SentenceSplitClass>();	// 줄단위 문장 분리

	// 기본 생성자 (외부에서 객체 생성 못하도록 private)
	private WordDataClass() {   
	}

}
