/**
 * 
 */
package com.caras;

/**
 * 
 */
public class VarClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//생각보다 윈도우 환경이랑 너무 똑같아서 조금 신기하네
		int[] intArr = {10,20,30,40,50};
		int sum = 0;
		for(int n = 0; n < 5; n++) {
			sum += intArr[n];
		}
		System.out.println("sum의 현재값 : " + sum); 
	}

}
