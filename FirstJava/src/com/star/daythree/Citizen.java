package com.star.daythree;
//program to demonstrate single inheritance
public class Citizen {
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name, long adhaarNo, String address, int phNo) {
		super();
		this.name = name;
		this.adhaarNo = adhaarNo;
		this.address = address;
		this.phNo = phNo;
	}
	protected String name;
	protected long adhaarNo;
	protected String address;
	protected int phNo;
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarNo=" + adhaarNo + ", address=" + address + ", phNo=" + phNo + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	
}
