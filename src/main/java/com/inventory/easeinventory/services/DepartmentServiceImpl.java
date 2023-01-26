package com.inventory.easeinventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.easeinventory.entity.Department;
import com.inventory.easeinventory.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department){
		
		Department fetchedDepartment = departmentRepository.findByDepartmentName(department.getDepartmentName());
		if(fetchedDepartment == null) {
			return departmentRepository.save(department);
		}
		else
			return fetchedDepartment;
	}

	
}