package com.nirav.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.nirav.model.Employee;

@Service
public class EmployeeService {
	
	public List<Employee> getEmployeeData(){
		List<Employee> lstEmployee = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpSalary(5000);
		employee.setEmpName("Nirav");
		employee.setDesignation("Team Leader");
		
		Employee employee2 = new Employee();
		employee2.setEmpId(2);
		employee2.setEmpSalary(5000);
		employee2.setEmpName("Vishal");
		employee2.setDesignation("Tech Leader");
		
		Employee employee3 = new Employee();
		employee3.setEmpId(3);
		employee3.setEmpSalary(5000);
		employee3.setEmpName("Rishit");
		employee3.setDesignation("Manager");
		
		lstEmployee.add(employee);
		lstEmployee.add(employee2);
		lstEmployee.add(employee3);
		
		return lstEmployee;
	}
}
