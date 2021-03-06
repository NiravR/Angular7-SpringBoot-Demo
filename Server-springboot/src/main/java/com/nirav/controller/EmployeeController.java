package com.nirav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nirav.model.Employee;
import com.nirav.service.EmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/employees", method=RequestMethod.GET,produces="application/json")
	public List<Employee> getEmployee(){
		System.out.println("Calling---------------");
		return employeeService.getEmployeeData(); 
	}
}
