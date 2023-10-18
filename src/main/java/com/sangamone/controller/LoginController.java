package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Login;
import com.sangamone.repository.LoginRepo;

@RestController
public class LoginController {
      @Autowired
      LoginRepo loginRepo;
      
      @PostMapping("/LoginDetails")
      public String addLoginDetails(@RequestBody Login login) {
    	  loginRepo.save(login);
    	  return "login details added successfully";
      }
}

