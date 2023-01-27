package com.goodroots.service;

import java.util.List;
import java.util.Optional;

import com.goodroots.exception.AdminException;
import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;
import com.goodroots.repository.AdminRepo;
import com.goodroots.repository.StudentRepo;

public class AdminServiceImpl implements AdminService{
	
	private StudentRepo studentRepo;
	private AdminRepo adminRepo;
	
	public AdminServiceImpl(StudentRepo studentRepo, AdminRepo adminRepo) {
		super();
		this.studentRepo = studentRepo;
		this.adminRepo = adminRepo;
	}

	@Override
	// This is for adding a new Student into Database
	public Student addStudent(Student student) throws StudentException {

		Optional<Student> existStudent = studentRepo.findById(student.getEmail());
		if(existStudent.isPresent())
			throw new StudentException("Student already Registered");
		else
			return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> students = studentRepo.findAll();
		if (students.isEmpty()) {
			throw new StudentException("No student registered yet");
		}else 
			return students;
	}

	@Override
	public Student findStudentByUserName(String username) throws StudentException {
		// This Line is for checking if user exists in DB 
		Optional<Student> student = studentRepo.findById(username);
		// this is if Student doesn't exist then throw an Exception
		if(student.isPresent())         
			return student.get();
		// if Student doesn't exist then throwing exception
		else
			throw new StudentException("Student is not registered with this email");
	}

	@Override
	public boolean logIn(String username, String password) throws AdminException {
		boolean present = adminRepo.existsById(username);
		if(present) {
			
		}
		return false;
	}


}
