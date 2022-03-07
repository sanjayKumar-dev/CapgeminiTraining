package com.sanjay.question5.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.question5.employee.Employee;
import com.sanjay.question5.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable String employeeId){
		return employeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee" )
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	@RequestMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	

	@RequestMapping(method=RequestMethod.PUT, value="/employee/{employeeId}" )
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String employeeId) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{employeeId}")
	public void deleteEmployee(@PathVariable String employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
	

}
