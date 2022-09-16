package com.soussHealthOnlineStore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.soussHealthOnlineStore.entity.User;
import com.soussHealthOnlineStore.repository.UserRepository;

@Service
public class UserServiceImpl implements PharmacieServices<User>{
	private UserRepository userRepository;

	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void update(User user, Long id) {
		User user1 = userRepository.findById(id).get();
		user1.setFullname(user.getFullname());
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
//		user1.setOrders(user.getOrders());
		userRepository.save(user1);
		
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public List<User> findByNameOrPartName(String name) {
		return null;
	}

}
