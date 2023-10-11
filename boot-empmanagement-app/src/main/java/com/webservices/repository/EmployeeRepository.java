package com.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
