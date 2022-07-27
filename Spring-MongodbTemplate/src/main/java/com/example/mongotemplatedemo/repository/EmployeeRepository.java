package com.example.mongotemplatedemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.mongotemplatedemo.model.Employee;

@Repository
public class EmployeeRepository {

	
    @Autowired
	MongoTemplate mongoTemplate;
	

	public Employee save(Employee emp) {
		return mongoTemplate.save(emp);
	}

	public List<Employee> getAll() {
		return mongoTemplate.findAll(Employee.class);
	}

	public Employee update(Employee emp) {
		return mongoTemplate.save(emp);
	}

	public long delete(Employee emp) {
		return mongoTemplate.remove(emp).getDeletedCount();
	}

	public List<Employee> getBySalary(int salary) {
		Query query=new Query(Criteria.where("salary").gte(salary));
		return mongoTemplate.find(query, Employee.class);
	}
}
