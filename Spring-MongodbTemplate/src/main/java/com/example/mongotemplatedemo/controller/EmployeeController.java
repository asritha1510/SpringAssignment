package com.example.mongotemplatedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongotemplatedemo.model.Employee;
import com.example.mongotemplatedemo.service.EmployeeService;
@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp) {
	return employeeService.save(emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@PutMapping("/updateAll")
	public Employee update(@RequestBody Employee emp){
		return employeeService.update(emp);
	}
	@DeleteMapping("/delete")
	public long delete(@RequestBody Employee emp){
		return employeeService.delete(emp);
	}
	
	@GetMapping("/getBySalary/{salary}")
	public List<Employee> getBySalary(@PathVariable("salary") int salary){
		return employeeService.getBySalary(salary);
	}
	
}
