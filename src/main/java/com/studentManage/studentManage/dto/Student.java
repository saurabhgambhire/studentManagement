package com.studentManage.studentManage.dto;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int stud_Id;
	private String stud_Name;
	private String stud_Email;
	private long stud_Mobile;
	private String stud_Address;

	public int getStud_Id() {
		return stud_Id;
	}

	public void setStud_Id(int stud_Id) {
		this.stud_Id = stud_Id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public String getStud_Email() {
		return stud_Email;
	}

	public void setStud_Email(String stud_Email) {
		this.stud_Email = stud_Email;
	}

	public long getStud_Mobile() {
		return stud_Mobile;
	}

	public void setStud_Mobile(long stud_Mobile) {
		this.stud_Mobile = stud_Mobile;
	}

	public String getStud_Address() {
		return stud_Address;
	}

	public void setStud_Address(String stud_Address) {
		this.stud_Address = stud_Address;
	}

	@Override
	public String toString() {
		return "Student [stud_Id=" + stud_Id + ", stud_Name=" + stud_Name + ", stud_Email=" + stud_Email
				+ ", stud_Mobile=" + stud_Mobile + ", stud_Address=" + stud_Address + "]";
	}

}
