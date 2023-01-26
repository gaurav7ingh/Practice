package com.goodroots.service;

import java.util.List;

import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;

public interface StudentService {
	
	Student addStudent(Student student) throws StudentException;
	List<Student> getAllStudent() throws StudentException;
	Student findStudentByUserName(String username) throws StudentException;
	Student updateStudent(String username,Student student);
	Student removeStudent(String username);
}
