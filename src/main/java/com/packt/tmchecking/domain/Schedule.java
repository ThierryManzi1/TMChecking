package com.packt.tmchecking.domain;

import java.time.LocalDate;

public class Schedule {
	
	private Long id;
	
	private LocalDate scheduleDate;
	
	private Building building;
	
	private Student student;

	public LocalDate getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(LocalDate scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
