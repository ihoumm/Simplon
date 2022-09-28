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

import com.ibraWaKhait.model.Role;
import com.ibraWaKhait.service.RoleService;



public class RoleController {
	
	private RoleService clientService;

	public RoleController(RoleService clientService) {
		super();
		this.clientService = clientService;
	}
	
	// build create Role REST API
			@PostMapping
			public ResponseEntity<Role> addRole(@RequestBody Role role) {
				return new ResponseEntity<Role>(clientService.addRole(role), HttpStatus.CREATED);
			}

			// build get all Role REST API
			@GetMapping()
			public List<Role> getAllRoles() {
				return clientService.getAllRoles();
			}

			// build get Role by id REST API
			// http://localhost:8080/api/Roles/1
			@GetMapping("{id}")
			public ResponseEntity<Role> getRoleById(@PathVariable("id") long role_id) {
				return new ResponseEntity<Role>(clientService.getRoleById(role_id), HttpStatus.OK);
			}

			// build update Role REST API
			// http://localhost:8080/api/Roles/1
			@PutMapping("{id}")
			public ResponseEntity<Role> updateRole(@PathVariable("id") long id, @RequestBody Role role) {
				return new ResponseEntity<Role>(clientService.updateRole(role, id), HttpStatus.OK);
			}

			// build delete Role REST API
			// http://localhost:8080/api/Roles/1
			@DeleteMapping("{id}")
			public ResponseEntity<String> deleteRole(@PathVariable("id") long id) {

				// delete Role from DB
				clientService.deleteRoleById(id);

				return new ResponseEntity<String>("Role deleted successfully!.", HttpStatus.OK);
			}

}
