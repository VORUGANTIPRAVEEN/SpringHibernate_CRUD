package com.example.user_Api_Authentication.service.impl;

import java.util.List;
import com.example.user_Api_Authentication.modal.User;
import com.example.user_Api_Authentication.repository.UserRepository;
import com.example.user_Api_Authentication.service.UserService;

public class UserImplService implements UserService {

	private UserRepository userrepository;

	public UserImplService(UserRepository userrepository) {
		super();
		this.userrepository = userrepository;
	}
	public List<User> getAllUsers() {
		return userrepository.findAll();
	}
	public User saveEmployee(User users) {
		return userrepository.save(users);
	}

}
