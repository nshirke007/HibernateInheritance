package com.scp.HibernateDemo1.InhiretanceInhibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("TwoWheeler")  
public class TwoWheeler extends Vehicle {
	String steeringhandle;

	@Override
	public String toString() {
		return "TwoWheeler [steeringhandle=" + steeringhandle + "]";
	}

//	public TwoWheeler(int vehicleID, String vehicleName, String steeringhandle) {
//		super(vehicleID, vehicleName);
//		this.steeringhandle = steeringhandle;
//	}

	public String getSteeringhandle() {
		return steeringhandle;
	}

	public void setSteeringhandle(String steeringhandle) {
		this.steeringhandle = steeringhandle;
	}

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public TwoWheeler(int vehicleID, String vehicleName) {
//		super(vehicleID, vehicleName);
//		// TODO Auto-generated constructor stub
//	}

}
