package com.example.user_Api_Authentication.service;

import java.util.List;

import com.example.user_Api_Authentication.modal.User;

public interface UserService {
	List<User> getAllUsers();
	User saveEmployee(User users);
}
