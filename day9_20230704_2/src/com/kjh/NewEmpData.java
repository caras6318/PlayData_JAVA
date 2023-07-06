package com.kjh;

import java.util.ArrayList;

public class NewEmpData {
	
	public ArrayList<NewEMP> nE = new ArrayList<NewEMP>();
	
	public NewEmpData() {
		// TODO Auto-generated constructor stub
	}
	public NewEmpData(String tmp) {
		this.Newinit(tmp);
//		System.out.println(tmp);
//		System.out.println("\n");
//		System.out.println("\n");
	}
	public void Newinit(String tmp) {
		String[] newEmp = tmp.split(",");
//		for(int i =0; i<newEmp.length; i++) {
//			System.out.println(newEmp[i]);
//		}
		this.NewinitData(newEmp);	
	
	}
	public void NewinitData(String[] newEmp) {
		
		nE.add(new NewEMP(newEmp[0], newEmp[1], newEmp[2], newEmp[3], newEmp[4], newEmp[5], newEmp[6], newEmp[7]));
	}
}
