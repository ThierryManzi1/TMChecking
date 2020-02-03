package com.packt.tmchecking.domain;

public class Building {

	private Long id;
	private String Name;
	private int roomNumber;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
