package com.goodroots.service;

import org.springframework.stereotype.Service;

import com.goodroots.exception.StudentException;
import com.goodroots.model.Student;

@Service
public interface StudentService {

	boolean logIn(String username, String password) throws StudentException;

	Student updateStudent(String username, Student student) throws StudentException;

}
