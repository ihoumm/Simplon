package com.sousstalent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sousstalent.model.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
