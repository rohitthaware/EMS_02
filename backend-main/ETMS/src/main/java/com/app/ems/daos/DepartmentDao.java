package com.app.ems.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ems.entities.Department;

public interface DepartmentDao extends JpaRepository<Department,  Integer>{
	
}
