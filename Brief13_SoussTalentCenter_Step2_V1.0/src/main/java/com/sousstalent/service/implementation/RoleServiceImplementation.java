package com.sousstalent.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sousstalent.model.Role;
import com.sousstalent.model.RoleModel;
import com.sousstalent.repository.RoleRepository;
import com.sousstalent.service.RoleSerivce;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RoleServiceImplementation implements RoleSerivce{
	
	private RoleRepository roleRepository;

	@Override
    public RoleModel createRole(RoleModel roleModel) {

        Role role = new Role();
        BeanUtils.copyProperties(roleModel, role);//model to entity conversion

        Role roleEntity1 = roleRepository.save(role);

        BeanUtils.copyProperties(roleEntity1, roleModel);//entity to model conversion
        return roleModel;
    }

    @Override
    public List<RoleModel> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        List<RoleModel> roleModels = new ArrayList<>();
        RoleModel roleModel = null;
        for(Role role : roles){
            roleModel = new RoleModel();
            BeanUtils.copyProperties(role, roleModel);
            roleModels.add(roleModel);
        }
        return roleModels;
    }

    @Override
    public RoleModel getRoleById(Long roleId) {
        Role roleEntity = roleRepository.findById(roleId).get();
        RoleModel roleModel = new RoleModel();
        BeanUtils.copyProperties(roleEntity, roleModel);
        return roleModel;
    }

    @Override
    public void deleteRoleById(Long roleId) {
        roleRepository.deleteById(roleId);
    }

}
