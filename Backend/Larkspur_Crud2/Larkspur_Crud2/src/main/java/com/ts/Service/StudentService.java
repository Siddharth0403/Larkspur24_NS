package com.ts.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.Model.Student;
import com.ts.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository sr;
	
	public Student getStudent(String name) {
		
		Student s1 = new Student(1,"Ram","Pune");
		Student s2 = new Student(1,"Sham","Mumbai");
		
		List<Student> students = Arrays.asList(s1,s2);
		for(Student student:students) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return new Student();
	}
	
	public Student addStudent (Student student) {
		return sr.save(student);
	}
	
	public List<Student> getStudents(){
		return sr.findAll();
	}
	
	

}
