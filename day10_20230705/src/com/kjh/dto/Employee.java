package com.kjh.dto; //Data Transfer Object 데이터를 싣고 다니는 오브젝트 in Spring= ValueObject
//하나의레코드 정보를객체화 
public class Employee {
	
	private int empNo = 0; // 사원 고유번호
	private String empName = null; // 사원이름
	private String job = null; // 직급
	private String mgr = null; // 직급번호
	private String hireDate = null; // 입사일
	private int sale = 0; // 급여
	private int commission = 0;// 성과급
	private int deptNo = 0;  // 부서번호
	
	
	
	public Employee() {


	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", sale=" + sale + ", commission=" + commission + ", deptNo=" + deptNo + "]";
	}

}
