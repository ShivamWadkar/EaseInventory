package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inventory.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

//	@Query(value="select * from department_tbl where department_name=:departmentName",nativeQuery = true)
//	  public Department getDepartmentByName(@Param("departmentName") String departmentName);
	
	public Department findByDepartmentName(String departmentName);
}
