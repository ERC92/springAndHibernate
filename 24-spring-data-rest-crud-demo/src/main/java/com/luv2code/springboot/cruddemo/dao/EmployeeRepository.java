package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv2code.springboot.cruddemo.entity.Employee;

@RepositoryRestResource(path="members") // default is lowercase entity (Employee) with 's' at end
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// no need to write any CRUD methods - get them all for free

}
