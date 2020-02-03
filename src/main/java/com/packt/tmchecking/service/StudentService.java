package com.packt.tmchecking.service;

import java.util.List;

import com.packt.tmchecking.domain.Schedule;
import com.packt.tmchecking.domain.Student;

public interface StudentService {
	
	public void create(Student student);
	
	public void deleteSchedule(Schedule schedule);
	
	public List<Student> getAll();
	
	public Student  getStudentById();
	

}
