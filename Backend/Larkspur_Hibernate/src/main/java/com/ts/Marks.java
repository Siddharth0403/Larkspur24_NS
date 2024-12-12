package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Id
	private int rollno;
	private String English;
	private String Maths;
	private String Science;
	
	
	public String getEnglish() {
		return English;
	}
	public void setEnglish(String english) {
		English = english;
	}
	public String getMaths() {
		return Maths;
	}
	public void setMaths(String maths) {
		Maths = maths;
	}
	public String getScience() {
		return Science;
	}
	public void setScience(String science) {
		Science = science;
	}
	
	public Marks() {}
	public Marks(int rollno, String english, String maths, String science) {
		
		this.rollno = rollno;
		English = english;
		Maths = maths;
		Science = science;
	}
	
	
	
	
	

}
