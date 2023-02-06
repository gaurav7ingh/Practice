package com.goodroots.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.goodroots.LoginDTO;
import com.goodroots.exception.AdminException;
import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;
import com.goodroots.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	private AdminService service;
	
	@GetMapping("/login")
	public ResponseEntity<Boolean> login(@RequestBody LoginDTO login) throws AdminException{
		boolean ans = service.logIn(login.getUsername(), login.getPassword());
		return new ResponseEntity<>(ans,HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) throws StudentException{
		student = service.addStudent(student);
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent() throws StudentException {
		List<Student> students = service.getAllStudent();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}

	@GetMapping("/studetns/{username}")
	public ResponseEntity<Student> findStudentByUserName(@PathVariable String username) throws StudentException{
		Student student = service.findStudentByUserName(username);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}

	@DeleteMapping("/{username}")
	public ResponseEntity<Student> removeStudent(@PathVariable String username) throws StudentException{
		Student student = service.removeStudent(username);
		return new ResponseEntity<Student>(student,HttpStatus.ACCEPTED);
	}

	
}
