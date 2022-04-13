package com.app.ems.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ems.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee	, Integer>{
	Employee findByEmail ( String email );	
	List<Employee> findByDept ( int  dept );	
	List<Employee> findByManagerId(int mid);
//	Employee savepassword( String password );
}
