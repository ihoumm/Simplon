package com.ibraWaKhait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.ibraWaKhait.model.Category;
import com.ibraWaKhait.model.User;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "categories", path = "category")
public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category save(User user);

}
