package com.funcolon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funcolon.model.User;
import com.funcolon.service.UserService;

@RestController

public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/test")
	public User getUser()
	{		
		return userService.getUser();
	}
}
