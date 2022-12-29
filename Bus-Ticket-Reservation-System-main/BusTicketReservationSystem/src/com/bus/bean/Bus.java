package com.bus.bean;

public class Bus {

	 private int busNo;
	 
	 private String busName;
	 
	 private String routeFrom;
	 
	 private String routeTo;
	 
	 private String busType;
	 
	 private String arrival;
	 
	 private String departure;
	 
	 private int totalSeats;
	 
	 private int availSeats;
	 
	 private int fare;

	public Bus(int busNo, String busName, String routeFrom, String routeTo, String busType, String arrival,
			String departure, int totalSeats, int availSeats, int fare) {
		super();
		this.busNo = busNo;
		this.busName = busName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.busType = busType;
		this.arrival = arrival;
		this.departure = departure;
		this.totalSeats = totalSeats;
		this.availSeats = availSeats;
		this.fare = fare;
	}

	public Bus() {
		super();
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getbusName() {
		return busName;
	}

	public void setbusName(String busName) {
		this.busName = busName;
	}

	public String getRouteFrom() {
		return routeFrom;
	}

	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public String getbusType() {
		return busType;
	}

	public void setbType(String bType) {
		this.busType = bType;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailSeats() {
		return availSeats;
	}

	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busName=" + busName + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo
				+ ", busType=" + busType + ", arrival=" + arrival + ", departure=" + departure + ", totalSeats="
				+ totalSeats + ", availSeats=" + availSeats + ", fare=" + fare + "]";
	}

    
	 
	 
	 
}
