package com.example.user_Api_Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_Api_Authentication.modal.User;
public interface UserRepository extends JpaRepository<User, Long>{
	
}