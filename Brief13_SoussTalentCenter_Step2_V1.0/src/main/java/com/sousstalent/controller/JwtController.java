package com.sousstalent.controller;

import com.sousstalent.model.JwtRequest;
import com.sousstalent.model.JwtResponse;
import com.sousstalent.model.UtilisateurModel;
import com.sousstalent.service.UtilisateurDetailService;
import com.sousstalent.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UtilisateurDetailService utilisateurDetailService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public ResponseEntity<UtilisateurModel> register(@RequestBody UtilisateurModel utilisateurModel){
      UtilisateurModel utilisateurM = utilisateurDetailService.register(utilisateurModel);
      ResponseEntity<UtilisateurModel> re = new ResponseEntity<>(utilisateurM, HttpStatus.CREATED);
      return re;
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> generateToken(@RequestBody JwtRequest jwtRequest){

        UsernamePasswordAuthenticationToken upat = new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(), jwtRequest.getPassword());
        //authenticate the user
        authenticationManager.authenticate(upat);

        UserDetails userDetails = utilisateurDetailService.loadUserByUsername(jwtRequest.getUserName());
        String jwtToken = jwtUtil.generateToken(userDetails);

        JwtResponse jwtResponse = new JwtResponse(jwtToken);
        //return ResponseEntity.ok(jwtResponse);
        return new ResponseEntity<JwtResponse>(jwtResponse, HttpStatus.OK);

    }

    @GetMapping("/currentUser")
    public UtilisateurModel getCurrentUser(Principal principal) {
        UserDetails userDetails =  this.utilisateurDetailService.loadUserByUsername(principal.getName());
        return (UtilisateurModel) userDetails;
    }
}
