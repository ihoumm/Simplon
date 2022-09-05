package com.sousstalent.service;

import java.util.List;

import com.sousstalent.model.RoleModel;

public interface RoleSerivce {
	
	public RoleModel createRole(RoleModel roleModel);
    public List<RoleModel> getAllRoles();
    public RoleModel getRoleById(Long roleId);
    public void deleteRoleById(Long roleId);
	
}
