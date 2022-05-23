package com.atos;

public class Student {
	private int studentid;
	private int studentname;
	private String studentmarks;
	private boolean studentstatus;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, int studentname, String studentmarks, boolean studentstatus) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmarks = studentmarks;
		this.studentstatus = studentstatus;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getStudentname() {
		return studentname;
	}
	public void setStudentname(int studentname) {
		this.studentname = studentname;
	}
	public String getStudentmarks() {
		return studentmarks;
	}
	public void setStudentmarks(String studentmarks) {
		this.studentmarks = studentmarks;
	}
	public boolean isStudentstatus() {
		return studentstatus;
	}
	public void setStudentstatus(boolean studentstatus) {
		this.studentstatus = studentstatus;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmarks=" + studentmarks
				+ ", studentstatus=" + studentstatus + "]";
	}
    
}
