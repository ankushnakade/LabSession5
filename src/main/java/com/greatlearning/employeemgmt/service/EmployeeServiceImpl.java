package com.greatlearning.employeemgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemgmt.model.Employee;
import com.greatlearning.employeemgmt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void saveOrUpdate(Employee emp) {
		repository.save(emp);
	}

	@Override
	public void deleteEmployeeById(int id) {
		Employee emp = getEmployeeById(id);
		repository.delete(emp);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return repository.findById(id).get();
	}

}
