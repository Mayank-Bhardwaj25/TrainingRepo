package com.coforge.Beans;

import java.util.HashSet;

public class Employee {
	
	private int eid;
	private String ename;
	//private String dept;
	private Department dept;
	private HashSet<String> skillSet;
	
	public Employee() {
		super();
	}
	
	
	
	
	public Employee(int eid, String ename, Department dept, HashSet<String> skillSet) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.skillSet = skillSet;
	}




	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void setSkillSet(HashSet<String> skillSet) {
		this.skillSet = skillSet;
	}




	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", skillSet=" + skillSet + "]";
	}




	
	

}
