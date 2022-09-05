package com.sousstalent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sousstalent.model.RoleModel;
import com.sousstalent.service.RoleSerivce;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    private RoleSerivce roleSerivce;

    @PostMapping("/roles")
    public RoleModel createRole(@RequestBody RoleModel roleModel){
        return roleSerivce.createRole(roleModel);
    }

    @GetMapping("/roles")
    public List<RoleModel> getAllRoles(){
        return roleSerivce.getAllRoles();
    }

    @PreAuthorize("hasRole('ADMINISTRATEUR') or principal.utilisateurId == #utilisateurId")
    @DeleteMapping("/roles/{utilisateurId}/{roleId}")
    public void deleteRole(@PathVariable Long utilisateurId, @PathVariable Long roleId){
    	roleSerivce.deleteRoleById(roleId);
    }
}
