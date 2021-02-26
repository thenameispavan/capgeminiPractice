package com.student.bean;

public class Student {

	private String sid;
	private String name;
	private String phone;
	private int marks;
	public Student() {
		
	}
	public Student(String sid, String name, String phone, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.marks = marks;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public toString() {
		
	}

}
