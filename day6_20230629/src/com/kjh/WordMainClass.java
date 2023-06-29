package com.kjh;

public class WordMainClass {

	public static void main(String[] args) {
		String url_word = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day6_20230629/src/com/kjh/filetest/srcword.txt";
		String url_base = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day6_20230629/src/com/kjh/filetest/base.txt";
		
		WordMethodClass.readWord(url_word);
		WordMethodClass.readSentence(url_base);
		WordMethodClass.splitSentence();
		
		System.out.println(WordDataClass.sentence.size());
		System.out.println(WordDataClass.word.size());
		System.out.println(WordDataClass.splitSentence.size());
		
		WordMethodClass.repeatWordCount();
		for(WordCountClass w : WordDataClass.words) {
			System.out.print(w.word + "\t");
			System.out.println(w.count);
		}
		String tags = WordMethodClass.createHTML();
		
		String url_save = "/Users/caras/Desktop/code/Backend/PlayData/WorkJava_ec/day6_20230629/src/com/kjh/wordCount.html";
		WordPrintClass.saveHTML(url_save, tags);
		
	}

}
