package com.goodroots.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goodroots.exception.AdminException;
import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;

@Service
public interface AdminService {
	boolean logIn(String username,String password) throws AdminException;
	Student addStudent(Student student) throws StudentException;
	List<Student> getAllStudent() throws StudentException;
	Student findStudentByUserName(String username) throws StudentException;
}
