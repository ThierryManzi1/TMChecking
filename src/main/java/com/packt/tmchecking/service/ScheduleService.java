package com.packt.tmchecking.service;

import java.util.List;

import com.packt.tmchecking.domain.Schedule;

public interface ScheduleService {
	
	public List<Schedule> getAll();
	
	public Schedule getSchedule();
	
	public void  deleteSchedule();
	
	public void saveSchedule(Schedule schedule);

}
