package com.example.mongotemplatedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongotemplatedemo.model.Employee;
import com.example.mongotemplatedemo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}

	public List<Employee> getAll() {
		return employeeRepository.getAll();
	}

	public Employee update(Employee emp) {
		return employeeRepository.update(emp);
	}

	public long delete(Employee emp) {
		return employeeRepository.delete(emp);
	}

	public List<Employee> getBySalary(int salary) {
		return employeeRepository.getBySalary(salary);
	}
}
