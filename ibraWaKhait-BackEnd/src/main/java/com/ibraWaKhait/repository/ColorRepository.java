package com.ibraWaKhait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ibraWaKhait.model.Color;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "colors", path = "colors")
public interface ColorRepository extends JpaRepository<Color, Long> {

}
