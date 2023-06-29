package com.kjh;

public class WordCntMainClass {

	public static void main(String[] args) {
		// TODO Auto-gen2023erated method stub
		String url = "/Users/caras/Desktop/CODE/Backend/PlayData/WorkJava_ec/day5_20230628_2/src/com/kjh/base.txt";
		String srcurl = "/Users/caras/Desktop/CODE/Backend/PlayData/WorkJava_ec/day5_20230628_2/src/com/kjh/srcword.txt";
		
		WordCntDataClass wcdc = new WordCntDataClass(url);
		WordCntDataClass srcword = new WordCntDataClass(srcurl);
		
		int[] cntarr = new int[srcword.bs.size()];
		int cnt = 0;
		for(int i = 0; i < srcword.bs.size(); i++ ) {
			cnt = 0;
			System.out.print(srcword.bs.get(i).word2 + "의 갯수는 : ");
	
			
			for(int j = 0; j < wcdc.bs.size(); j++) {
				if(wcdc.bs.get(j).word2.contains(srcword.bs.get(i).word2)) {
					
					cnt++;
				}
			}
			System.out.println(cnt);
		}
//		for(int i = 0; i < cntarr.length; i++) {
//			System.out.print(srcword.bs.get(i).word2 + "갯수는 : ");
//			System.out.println(cntarr[i]);
//		}
		
	}

}
