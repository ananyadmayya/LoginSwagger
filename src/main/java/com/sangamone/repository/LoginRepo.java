package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.Login;

public interface LoginRepo extends JpaRepository<Login, Integer>{

}
