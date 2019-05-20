package com.nirav.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nirav.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
