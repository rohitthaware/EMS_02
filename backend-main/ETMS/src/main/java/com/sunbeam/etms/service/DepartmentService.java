package com.sunbeam.etms.service;

import java.util.List;

import com.sunbeam.etms.entities.Department;

public interface DepartmentService {
		  List<Department> findAll ();
		  Department findById(int id);
}
