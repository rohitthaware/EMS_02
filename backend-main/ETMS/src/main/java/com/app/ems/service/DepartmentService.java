package com.app.ems.service;

import java.util.List;

import com.app.ems.entities.Department;

public interface DepartmentService {
		  List<Department> findAll ();
		  Department findById(int id);
}
