package com.kjh;

public class Print {

	public Print() {
		// TODO Auto-generated constructor stub
	}
	public static void printSelectAll(ArrayList<Employee> emplist) {
		
		for(Employee employee : emplist) {
			System.out.println(employee);
			
		}
		
	}
	
	public static void printMenu()
	{
		System.out.print(false);
		System.out.print(false);
		System.out.print(false);
		System.out.print(false);
	}
}
