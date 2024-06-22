package com.star.programs.daythree;

public class Student extends Citizen {

	private int rollNo;
	private String collegeName;
	
	public Student() {
		super();
	}
	public Student(int rollNo, String collegeName) {
		super(name, adhaarNo, address, phNo);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
}
