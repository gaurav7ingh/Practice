package com.goodroots.service;

import java.util.Optional;
import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;
import com.goodroots.repository.StudentRepo;

public class StudentServiceImpl implements StudentService{

	private StudentRepo studentRepo;
	
	// This args constructor is used for autowire the variables  
	public StudentServiceImpl(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	@Override
	public Student updateStudent(String username, Student student) throws StudentException {
		boolean exists = studentRepo.existsById(username);
		if(!exists)
			throw new StudentException("Student is Not exist with this email");
		student.setEmail(username);
		return studentRepo.save(student);
	}

	@Override
	public Student removeStudent(String username) throws StudentException {
		Optional<Student> student = studentRepo.findById(username);
		if(!student.isPresent())
			throw new StudentException("Student is Not exist with this email");
		studentRepo.delete(student.get());
		return student.get();
	}

	@Override
	public boolean logIn(String username, String password) throws StudentException {
		boolean present = studentRepo.existsById(username);
		if(present) {
			
		}
		return false;
	}

}
