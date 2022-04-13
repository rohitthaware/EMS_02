package com.app.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ems.entities.Department;
import com.app.ems.entities.Employee;
import com.app.ems.models.Response;
import com.app.ems.service.DepartmentService;

@CrossOrigin
@RequestMapping("/")
@RestController
public class DepartmentControllerImpl {
	@Autowired
	private DepartmentService deptService;

	@RequestMapping("/depts")
	public ResponseEntity<?>  GetDepartments () {
		List<Department> dept = deptService.findAll();
		System.out.println("Dept >>>>>");
		if (dept != null) {
			System.out.println("inside dept  =>" +dept.toString());
			return Response.success(dept);
		}
		return Response.error(dept);
	}
	
	@RequestMapping("/getemplist")
	public ResponseEntity<?>  getEmpByDept (@ModelAttribute Department dept ) {
		System.out.println("inside getempbydept ==>"+dept.toString());
	
		Department department = deptService.findById(dept.getDeptId());
		System.out.println("dep====>"+department);
		List<Employee> emp = department.getEmpList();
		if (emp != null ) {
			System.out.println("empbydept ==>" +emp.toString());
			return Response.success(emp);
		}
		return Response.error(emp);
	}
}
