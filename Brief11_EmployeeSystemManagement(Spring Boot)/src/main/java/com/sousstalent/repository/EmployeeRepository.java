package com.sousstalent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sousstalent.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
   
}
