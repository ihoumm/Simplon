package com.soussHealthOnlineStore.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soussHealthOnlineStore.entity.Role;
import com.soussHealthOnlineStore.entity.URole;
import com.soussHealthOnlineStore.entity.User;
import com.soussHealthOnlineStore.payloads.request.LoginRequest;
import com.soussHealthOnlineStore.payloads.request.SignupRequest;
import com.soussHealthOnlineStore.payloads.response.JwtResponse;
import com.soussHealthOnlineStore.payloads.response.MessageResponse;
import com.soussHealthOnlineStore.repository.RoleRepository;
import com.soussHealthOnlineStore.repository.UserRepository;
import com.soussHealthOnlineStore.security.jwt.JwtUtils;
import com.soussHealthOnlineStore.security.service.UserDetailsImpl;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt, 
												 userDetails.getId(), 
												 userDetails.getUsername(), 
												 userDetails.getPassword(), 
												 roles));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByPassword(signUpRequest.getPassword())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Password is already in use!"));
		}

		// Create new user's account
		User user = new User(signUpRequest.getUsername(), 
							 encoder.encode(signUpRequest.getPassword()));

		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		if (strRoles == null) {
			Role userRole = roleRepository.findByName(URole.ROLE_VISITOR)
					.orElseThrow(() -> new RuntimeException("Error0: Role is not found."));
			roles.add(userRole);
			System.out.println("visitor");
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByName(URole.ROLE_ADMIN)
							.orElseThrow(() -> new RuntimeException("Error1: Role is not found."));
					roles.add(adminRole);
					user.setRoles(roles);
					userRepository.save(user);
					System.out.println("admin");
					break;
				case "cl":
					Role modRole = roleRepository.findByName(URole.ROLE_CLIENT)
							.orElseThrow(() -> new RuntimeException("Error2: Role is not found."));
					roles.add(modRole);
					user.setRoles(roles);
					userRepository.save(user);
					System.out.println("client");
					break;
				default:
					Role userRole = roleRepository.findByName(URole.ROLE_VISITOR)
							.orElseThrow(() -> new RuntimeException("Error3: Role is not found."));
					roles.add(userRole);
					user.setRoles(roles);
					userRepository.save(user);
				}
			});
		}

		//user.setRoles(roles);
		//userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
}