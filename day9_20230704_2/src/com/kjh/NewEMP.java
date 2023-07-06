package com.kjh;	

public class NewEMP {

	public int empNo = 0;
	public String empName = null;
	public String job = null;
	public String mgr = null;
	public String hireDate = null;
	public int sale = 0;
	public int commission = 0;
	public int deptNo = 0;
	
	public NewEMP() {
		// TODO Auto-generated constructor stub
	}
	public NewEMP(String empNo, String empName, String job, String mgr, String hireDate, String sale, String commission, String deptNo) {
		this.empNo = Integer.parseInt(empNo);
		this.empName = empName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sale = Integer.parseInt(sale);
		this.commission = Integer.parseInt(commission);;
		this.deptNo = Integer.parseInt(deptNo);;
	}

}
