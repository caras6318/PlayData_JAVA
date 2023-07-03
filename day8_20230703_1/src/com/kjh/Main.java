package com.kjh;

public class Main {

	public static void main(String[] args) {
		
//		SingleToneClass = new SingleToneClass();
		//	1.생성된 객체를 리턴 받는 형태 
		SingleToneClass s = SingleToneClass.getinstance();
		//  2.생성된 객체를 리턴 받지 않는 형태
		SingleToneClass.getInstance();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Das");
			}
		}).start();

	
	//익명객체는 사용후 일정시간이 지나면 jvm 알아서 소멸시킨다
	//따라서 메모리를 효율적으로 사용할 수 있다.
	// jvm은 가비지 컬렌션이라는 곳에 사용되지않는변수(객체등)들을 자동으로 넣어서 소멸시킨다.
	
	new Thread(() -> {
		System.out.println("Das");
	}).start();
	
	Func add = (int a, int b) -> a+ b;
		
	}

}

interface Func{
	public int cal(int n1, int n2);
	
}
