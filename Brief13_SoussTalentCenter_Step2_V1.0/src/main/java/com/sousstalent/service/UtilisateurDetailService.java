package com.sousstalent.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sousstalent.model.Role;
import com.sousstalent.model.RoleModel;
import com.sousstalent.model.Utilisateur;
import com.sousstalent.model.UtilisateurModel;
import com.sousstalent.repository.RoleRepository;
import com.sousstalent.repository.UtilisateurRepository;

@Service
public class UtilisateurDetailService implements UserDetailsService {
	
	
	@Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UtilisateurModel register( UtilisateurModel utilisateurModel){

        Utilisateur utilisateur = new Utilisateur();
        BeanUtils.copyProperties(utilisateurModel, utilisateur);//it does not do a deep copy

        Set<Role> role = new HashSet<>();
        //fetch every role from DB based on role id and than set this role to user entity roles
        for(RoleModel rolemodel :utilisateurModel.getRoles()){
            Optional<Role> optRole = roleRepository.findById(rolemodel.getId());
            if(optRole.isPresent()){
                role.add(optRole.get());
            }
        }
        utilisateur.setRoles(role);
        utilisateur.setPassword(this.passwordEncoder.encode(utilisateurModel.getPassword()));
        utilisateur = utilisateurRepository.save(utilisateur);

        BeanUtils.copyProperties(utilisateur, utilisateurModel);

        //convert RoleEntities to RoleModels
        Set<RoleModel> roleModels = new HashSet<>();
        RoleModel rolemodel = null;
        for(Role rolee :utilisateur.getRoles()){
        	rolemodel = new RoleModel();
        	rolemodel.setRoleName(rolee.getRoleName());
        	rolemodel.setId(rolee.getId());
            roleModels.add(rolemodel);
        }
        utilisateurModel.setRoles(roleModels);
        return utilisateurModel;
    }

    //this method actually does the validation for user existence
    @Override
    public UserDetails loadUserByUsername( String userName) throws UsernameNotFoundException {

         Utilisateur utilisateur = utilisateurRepository.getUserByUsername(userName);

        if(utilisateur == null){//here you can make a DB call with the help of repository and do the validation
            throw new UsernameNotFoundException("User does not exist!");
        }

        UtilisateurModel utilisateurModel = new UtilisateurModel();
        BeanUtils.copyProperties(utilisateur, utilisateurModel);

        //convert RoleEntities to RoleModels
        Set<RoleModel> roleModels = new HashSet<>();
        RoleModel rm = null;
        for(Role re :utilisateur.getRoles()){
            rm = new RoleModel();
            rm.setRoleName(re.getRoleName());
            rm.setId(re.getId());
            roleModels.add(rm);
        }

        utilisateurModel.setRoles(roleModels);
        return utilisateurModel;
    }

}
