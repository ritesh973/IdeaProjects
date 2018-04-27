package com.rits.autowiring;

public class Employee {

	private Integer empId;
	
	private String empName;
	
	private String email;
	
	private PanCard panCard;

	public Employee(Integer empId, String empName, String email, PanCard panCard) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.panCard = panCard;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}



	
}
