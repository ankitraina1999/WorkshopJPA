package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	List<Department>department;
	Department dept = new Department();
	
	@Autowired
	private DepartmentRepository repo;
	
	public DepartmentService() {
	}
	
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		repo.save(department);
		return dept;
	}

}
