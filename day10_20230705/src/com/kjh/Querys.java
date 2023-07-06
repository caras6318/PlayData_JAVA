package com.kjh;

//Oracle MySQL SQLite : ANSI표준 query
//selectAll().insert(),update(),delete,selectOne();

public interface Querys {
	//public abstract class Querys {
String querrySelectAll = "select * from employee";
String querryInsert = "select * from employee";
String querryDelete = "select * from employee";
String querryUpdate = "select * from employee";
String querrySelectOne = "select * from employee";





	public int empNo = 0;
	public String empName = null;
	public String job = null;
	public String mgr = null;
	public String hireDate = null;
	public int sale = 0;
	public int commission = 0;
	public int deptNo = 0;
	
	public Querys() {
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