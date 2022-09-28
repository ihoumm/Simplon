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

import com.ibraWaKhait.model.Admin;
import com.ibraWaKhait.service.AdminService;

public class AdminController {
	
	private AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	// build create Admin REST API
			@PostMapping
			public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
				return new ResponseEntity<Admin>(adminService.addAdmin(admin), HttpStatus.CREATED);
			}

			// build get all Admin REST API
			@GetMapping()
			public List<Admin> getAllAdmins() {
				return adminService.getAllAdmins();
			}

			// build get Product by id REST API
			// http://localhost:8080/api/admins/1
			@GetMapping("{id}")
			public ResponseEntity<Admin> getAdminById(@PathVariable("id") long admin_id) {
				return new ResponseEntity<Admin>(adminService.getAdminById(admin_id), HttpStatus.OK);
			}

			// build update Product REST API
			// http://localhost:8080/api/admins/1
			@PutMapping("{id}")
			public ResponseEntity<Admin> updateAdmin(@PathVariable("id") long id, @RequestBody Admin admin) {
				return new ResponseEntity<Admin>(adminService.updateAdmin(admin, id), HttpStatus.OK);
			}

			// build delete Product REST API
			// http://localhost:8080/api/admins/1
			@DeleteMapping("{id}")
			public ResponseEntity<String> deleteAdmin(@PathVariable("id") long id) {

				// delete Product from DB
				adminService.deleteAdminById(id);

				return new ResponseEntity<String>("Admin deleted successfully!.", HttpStatus.OK);
			}

}
