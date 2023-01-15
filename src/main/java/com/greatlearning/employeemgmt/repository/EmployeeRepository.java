package com.greatlearning.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemgmt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
