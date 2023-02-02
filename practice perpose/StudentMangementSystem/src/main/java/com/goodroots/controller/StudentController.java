package com.goodroots.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goodroots.LoginDTO;
import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;
import com.goodroots.service.StudentService;

@RestController
public class StudentController {
	
	private StudentService studentService;
	
	@PutMapping
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) throws StudentException{
		student = studentService.updateStudent("this", student);
		return new ResponseEntity<Student>(student,HttpStatus.ACCEPTED);
	}
	
	@GetMapping
	public ResponseEntity<Boolean> loginHandler(@RequestBody LoginDTO loginCredential) throws StudentException{
		boolean ans =  studentService.logIn(loginCredential.getUsername(), loginCredential.getPassword());
		return new ResponseEntity<Boolean>(ans,HttpStatus.OK);
	}
	
}
