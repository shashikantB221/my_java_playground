package com.student.manage;

public class Student {

	private int rollno;
	private String sname;
	private int sphone;
	private String scity;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
	}
	public Student(int rollno, String sname, int sphone, String scity) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	public Student(String sname, int sphone, String scity) {
		super();
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSphone() {
		return sphone;
	}
	public void setSphone(int sphone) {
		this.sphone = sphone;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	
	
	
	
	
}
