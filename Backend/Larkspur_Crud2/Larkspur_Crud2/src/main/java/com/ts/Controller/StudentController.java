package com.ts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.Model.Student;
import com.ts.Service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
		return ss.addStudent(student);
	}
	@GetMapping("/get-students")
	public List<Student> getStudent(){
		return ss.getStudents();
	}
	
}
