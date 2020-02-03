package com.packt.tmchecking.service;

import java.util.List;

import com.packt.tmchecking.domain.Student;

public interface AdminService {
	
	public void  importStudents(List<Student> students);
	
	public void  deleteStudent(int id);

}
