package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Admin;
import com.ibraWaKhait.repository.AdminRepository;
import com.ibraWaKhait.service.AdminService;

public class AdminServiceImplementation implements AdminService {
	
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return this.adminRepository.findAll();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdminById(Long id) {
		// TODO Auto-generated method stub
		return this.adminRepository.findById(id).get();
	}

	@Override
	public Admin updateAdmin(Admin admin, Long id) {
		Admin exestingAdmin = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("adminRepository", "id", id));
		
		exestingAdmin.setId(admin.getId());
		exestingAdmin.setFirst_name(admin.getFirst_name());
		exestingAdmin.setLast_name(admin.getLast_name());
		exestingAdmin.setUsername(admin.getUsername());
		exestingAdmin.setPassword(admin.getPassword());
		exestingAdmin.setRole(admin.getRole());
		
		adminRepository.save(exestingAdmin);
		
		return exestingAdmin;
	}

	@Override
	public void deleteAdminById(Long id) {


		this.adminRepository.deleteById(id);
		
	}

}
