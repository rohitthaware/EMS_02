package com.sunbeam.etms.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.etms.entities.Department;

public interface DepartmentDao extends JpaRepository<Department,  Integer>{
	
}
