package com.nirav.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirav.model.Department;
import com.nirav.repository.DepartmentRepository;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;

	@GetMapping("/department")
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@GetMapping("/department/{id}")
	public ResponseEntity<Department> getDepartmentById(
			@PathVariable(value = "id") Long id) throws Exception {
		Department department = departmentRepository.findById(id).get();
		return ResponseEntity.ok().body(department);
	}

	@PostMapping("/department")
	public Department createDepartment(@Valid @RequestBody Department department) {
		return departmentRepository.save(department);
	}

	@PutMapping("/department/{id}")
	public ResponseEntity<Department> updateDepartment(
			@PathVariable(value = "id") Long id,
			@RequestBody Department departmentData) {
		Department department = departmentRepository.findById(id).get();
		
		department.setDeptname(departmentData.getDeptname());
		
		final Department updatedDepartment = departmentRepository.save(department);
		return ResponseEntity.ok(updatedDepartment);
	}

	@DeleteMapping("/department/{id}")
	public Map<String, Boolean> deleteDepartment(@PathVariable(value = "id") Long id){
		Department department = departmentRepository.findById(id).get();
		departmentRepository.delete(department);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
