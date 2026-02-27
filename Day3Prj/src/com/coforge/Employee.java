package com.coforge;

public class Employee {

	
		
		private String name;
		private int id;
		//private String companyName;
		static String companyName = "Coforge";
		private double bsalary;
		
	   public Employee() {
		super();
	  }



	//public Employee(String name, int id, String companyName) {
	   public Employee(String name, int id, double bsalary) {
		super();
		this.name = name;
		this.id = id;
		this.bsalary = bsalary;
		//this.companyName = companyName;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



//	public String getCompanyName() {
//		return companyName;
//	}
//
//
//
//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}

  public double getSalary() {
	  return bsalary;
  }
  
  public void setSalary(double bsalary) {
	  this.bsalary = bsalary;
  }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyName=" + companyName + ", salary=" +bsalary+ "]";
	}
   
	public void calSalary() {
		double netSal;
		if(this.bsalary > 50000) {
			double hra = 0.10;
			double da = 0.10;
			netSal = bsalary+bsalary*hra + bsalary*da;
		}
		else {
			netSal = bsalary;
		}
		System.out.println("Net Salary =" +netSal);
	}
	


}
