package com.sanjay.question5.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjay.question5.employee.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
