package com.sousstalent.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sousstalent.model.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	
	
	@Query("SELECT u FROM Utilisateur u WHERE u.login = :login")
    public Utilisateur getUserByUsername(@Param("login") String login);	
}
