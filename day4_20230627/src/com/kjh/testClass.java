package com.kjh;

public class testClass {
	
	int a = 10;						/// default이기 때문에 동일한 패키지에서만 사용이가능하다
	private String name = "sss";	/// private이기 때문에 외부에서 접근이 불가능하다
	public boolean b = true;		/// public이기 때문에 누구나 접근이 가능 
	
	public testClass() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

}
