package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Role;

public interface RoleService {
	
	List<Role> getAllRoles();
	
	Role addRole(Role role);
	
	Role getRoleById(Long id);
	
	Role updateRole(Role role, Long id);
	
	void deleteRoleById(Long id);
	

}
