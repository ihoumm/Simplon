package com.ibraWaKhait.service.implementation;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Color;
import com.ibraWaKhait.model.User;
import com.ibraWaKhait.repository.UserRepository;
import com.ibraWaKhait.service.UserService;
import lombok.AllArgsConstructor;


public class UserServiceImplemetation implements UserService{
	
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id).get();
	}

	@Override
	public User updateUser(User user, long id) {
		
		User exestingUser = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("userRepository", "id", id));
		
		exestingUser.setUser_id(user.getUser_id());
		exestingUser.setFirstName(user.getFirstName());
		exestingUser.setLastName(user.getLastName());
		exestingUser.setUsername(user.getUsername());
		exestingUser.setPassword(user.getPassword());
//		exestingUser.setRole(user.getRole());
		
		
		
		userRepository.save(exestingUser);
		
		return exestingUser;
	}

	@Override
	public void deleteUserById(long id) {
		this.userRepository.deleteById(id);
		
	}

	

}
