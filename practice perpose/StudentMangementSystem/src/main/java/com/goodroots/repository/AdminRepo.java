package com.goodroots.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodroots.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {

}
