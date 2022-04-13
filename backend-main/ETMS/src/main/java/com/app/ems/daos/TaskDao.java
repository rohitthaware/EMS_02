package com.app.ems.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.ems.entities.Project;
import com.app.ems.entities.Task;

public interface TaskDao extends JpaRepository<Task, Integer>{
	@Query(value =  "SELECT * FROM task  where emp_id = ?1 AND t_approvalStatus = ?2" ,nativeQuery = true)
	List<Task> findByEmpAndApprovalStatus( int empId,String approvalStatus);
	
	List<Task> findByApprovalStatus(String approvalStatus);
	
	@Query(value =  "SELECT * FROM task  where p_id = ?1 " ,nativeQuery = true)
	List<Task> findByProject(int pid);
	
	int countByApprovalStatus(String approvalStatus);
}
