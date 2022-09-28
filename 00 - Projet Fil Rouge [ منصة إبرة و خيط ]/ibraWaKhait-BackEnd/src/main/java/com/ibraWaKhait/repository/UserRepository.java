package com.ibraWaKhait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ibraWaKhait.model.User;

@Repository
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "user")
public interface UserRepository extends JpaRepository<User, Long> {

}
