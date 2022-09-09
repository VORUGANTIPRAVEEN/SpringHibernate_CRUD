package com.example.user_Api_Authentication.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.user_Api_Authentication.modal.User;
import com.example.user_Api_Authentication.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	
	public UserService userservice;
	
	@GetMapping("/all")
	public List<User> allusersssss(){
		return userservice.getAllUsers();
	}
}
