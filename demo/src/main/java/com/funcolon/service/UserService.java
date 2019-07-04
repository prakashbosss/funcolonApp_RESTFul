package com.funcolon.service;

import org.springframework.stereotype.Service;

import com.funcolon.model.User;

@Service
public class UserService {
	
	public User getUser()
	{		
		User u=new User(1,"Prakash1","mypassword1","admin1");		
		return u;
	}

}
