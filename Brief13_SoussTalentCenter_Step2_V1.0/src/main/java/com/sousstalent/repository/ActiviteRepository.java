package com.sousstalent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sousstalent.model.Activite;

public interface ActiviteRepository extends JpaRepository<Activite, Long> {

}
