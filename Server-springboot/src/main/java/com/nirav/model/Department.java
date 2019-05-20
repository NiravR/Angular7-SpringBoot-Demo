package com.nirav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "department")
public class Department {

	private long id;
	private String deptname;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(long id, String deptname){
		this.id = id;
		this.deptname = deptname;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "deptname", nullable = false)
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Department [id= "+id +" name "+deptname + "]";
	}
	
}
