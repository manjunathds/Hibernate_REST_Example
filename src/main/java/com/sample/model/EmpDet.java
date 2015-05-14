package com.sample.model;

import java.math.BigDecimal;

public class EmpDet{

	private int slNo;
	//private int empId;
	private EmpMstr empMstr;
	private BigDecimal empCtc;
	private BigDecimal empPfAmt;
	private BigDecimal empTaxAmt;
	
	public EmpDet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDet(int slNo,  EmpMstr empMstr, BigDecimal empCtc,
			BigDecimal empPfAmt, BigDecimal empTaxAmt) {
		super();
		this.slNo = slNo;
		//this.empId = empId;
		this.empMstr = empMstr;
		this.empCtc = empCtc;
		this.empPfAmt = empPfAmt;
		this.empTaxAmt = empTaxAmt;
	}
	
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	/*public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}*/
	public EmpMstr getEmpMstr() {
		return empMstr;
	}
	public void setEmpMstr(EmpMstr empMstr) {
		this.empMstr = empMstr;
	}
	public BigDecimal getEmpCtc() {
		return empCtc;
	}
	public void setEmpCtc(BigDecimal empCtc) {
		this.empCtc = empCtc;
	}
	public BigDecimal getEmpPfAmt() {
		return empPfAmt;
	}
	public void setEmpPfAmt(BigDecimal empPfAmt) {
		this.empPfAmt = empPfAmt;
	}
	public BigDecimal getEmpTaxAmt() {
		return empTaxAmt;
	}
	public void setEmpTaxAmt(BigDecimal empTaxAmt) {
		this.empTaxAmt = empTaxAmt;
	}
}
