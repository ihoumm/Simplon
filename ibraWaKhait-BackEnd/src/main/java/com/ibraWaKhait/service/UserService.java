package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.User;



public interface UserService {
	
	List<User> getAllUsers();

	User addUser(User user);
	
	User getUserById(long id);
	
	User updateUser(User user, long id);

	void deleteUserById(long id);
	
}
