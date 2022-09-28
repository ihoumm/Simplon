package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Admin;

public interface AdminService {
	
	List<Admin> getAllAdmins();
	
	Admin addAdmin(Admin admin);
	
	Admin getAdminById(Long id);
	
	Admin updateAdmin(Admin admin, Long id);
	
	void deleteAdminById(Long id);
}
