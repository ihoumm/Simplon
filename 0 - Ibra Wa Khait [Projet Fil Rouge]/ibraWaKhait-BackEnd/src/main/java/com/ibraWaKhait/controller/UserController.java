package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibraWaKhait.model.Product;
import com.ibraWaKhait.model.User;
import com.ibraWaKhait.service.UserService;

public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	// build create User REST API
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.CREATED);
	}

	// build get all User REST API
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// build get User by id REST API
	// http://localhost:8080/api/user/1
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long user_id) {
		return new ResponseEntity<User>(userService.getUserById(user_id), HttpStatus.OK);
	}

	// build update User REST API
	// http://localhost:8080/api/user/1
	@PutMapping("{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
		return new ResponseEntity<User>(userService.updateUser(user, id), HttpStatus.OK);
	}

	// build delete User REST API
	// http://localhost:8080/api/user/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long id) {

		// delete User from DB
		userService.deleteUserById(id);

		return new ResponseEntity<String>("User deleted successfully!.", HttpStatus.OK);
	}

}
