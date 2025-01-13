package com.ts.Larkspur_ManytoMany;

import jakarta.persistence.Entity;

@Entity
public class Batch {
	
	@jakarta.persistence.Id
	private int Id;
	private String subject;
	private String TeacherName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	
	public Batch() {}
	public Batch(int id, String subject, String teacherName) {
		
		Id = id;
		this.subject = subject;
		TeacherName = teacherName;
	}
	
	
	

}
