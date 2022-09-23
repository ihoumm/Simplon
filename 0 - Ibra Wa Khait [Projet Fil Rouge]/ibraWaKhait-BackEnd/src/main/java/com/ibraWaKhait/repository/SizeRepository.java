package com.ibraWaKhait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ibraWaKhait.model.Size;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "sizes", path = "sizes")
public interface SizeRepository extends JpaRepository<Size, Long> {

}
