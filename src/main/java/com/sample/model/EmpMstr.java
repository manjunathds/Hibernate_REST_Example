package com.sample.model;
import java.util.HashSet;
import java.util.Set;
public class EmpMstr {

	private int slNo;
	private String empId;
	private String empFirstName;
	private String empLastName;
	private String empDept;
	private String empGroup;
	private String empType;
	private Set<EmpDet> empDet = new HashSet<EmpDet>(0);
	
	
	public EmpMstr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpMstr(int slNo, String empId, String empFirstName,
			String empLastName, String empDept, String empGroup, String empType) {
		super();
		this.slNo = slNo;
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empDept = empDept;
		this.empGroup = empGroup;
		this.empType = empType;
	}
	
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpGroup() {
		return empGroup;
	}
	public void setEmpGroup(String empGroup) {
		this.empGroup = empGroup;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public Set<EmpDet> getEmpDet() {
		return empDet;
	}

	public void setEmpDet(Set<EmpDet> empDet) {
		this.empDet = empDet;
	}
	
	
	
}
