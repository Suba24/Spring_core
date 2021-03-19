package com.subatech.springcore.model;

public class Address {
	private String city;
	private String state;
	private String lane;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", lane=" + lane + "]";
	}
}
