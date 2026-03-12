package com.coforge.Day5MavenPrj;

public class Student implements Comparable<Student> {

	private int studId;
	private String studName;
	private double marks;
	public Student() {
		super();
	}
	public Student(int studId, String studName, double marks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
	}
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studId - o.studId;
	}
	
	
}
