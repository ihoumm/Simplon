package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Role;
import com.ibraWaKhait.repository.RoleRepository;
import com.ibraWaKhait.service.RoleService;

public class RoleServiceImplementation implements RoleService{
	
	private RoleRepository roleRepository;

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return this.roleRepository.save(role);
	}

	@Override
	public Role getRoleById(Long id) {
		// TODO Auto-generated method stub
		return this.roleRepository.findById(id).get();
	}

	@Override
	public Role updateRole(Role role, Long id) {
		 Role exestingRole =roleRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("roleRepository", "id", id));
		 
		 exestingRole.setId(role.getId());
		 exestingRole.setRole_name(role.getRole_name());
		 exestingRole.setUsers(role.getUsers());
		 
		 roleRepository.save(exestingRole);
		 
		return exestingRole;
	}

	@Override
	public void deleteRoleById(Long id) {
		this.roleRepository.deleteById(id);
	}

}
