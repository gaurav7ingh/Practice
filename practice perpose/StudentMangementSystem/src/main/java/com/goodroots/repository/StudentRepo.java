package com.goodroots.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodroots.model.Student;

public interface StudentRepo extends JpaRepository<Student, String> {

}
