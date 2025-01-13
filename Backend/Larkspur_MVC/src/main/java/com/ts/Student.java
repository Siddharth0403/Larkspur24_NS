package com.ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
//Controller + responsebody = RestController (RestApi)
	
//	CRUD = Create Read Update Delete
//  C= PostMapping
//	R = GetMapping
//	U = PutMapping
//	D = DeleteMapping
	
	@GetMapping("/std")
	public String std() {
		return ("Hello how are you??");
	}
	
	@GetMapping("/std2")
	public String std2() {
		return ("I am student 2");
	}
	
 
}
