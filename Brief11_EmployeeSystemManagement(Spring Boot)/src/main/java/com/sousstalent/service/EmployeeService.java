package com.sousstalent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sousstalent.model.Employee;
import com.sousstalent.repository.EmployeeRepository;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);
		
	Employee getEmployeeById(Long id);
		
	Employee updateEmployee(Employee employee);
		
	void deleteEmployeeById(Long id);

}
