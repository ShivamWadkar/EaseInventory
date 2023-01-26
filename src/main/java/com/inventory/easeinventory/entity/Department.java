package com.inventory.easeinventory.entity;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "department_tbl")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private int departmentId;
	
	@Column(name="department_name",columnDefinition = "VARCHAR(100)",nullable = false,unique = true)
	private String departmentName;
	
	
	@OneToMany(mappedBy = "department")
	private Set<User> user;
	
	public Department() {
		
	}

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName;
	}
	
	
	
}
