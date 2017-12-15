package com.scp.HibernateDemo1.InhiretanceInhibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("fourWheeler") 
public class FourWheeler extends Vehicle {
String streeringWheel;

//public FourWheeler(int vehicleID, String vehicleName, String streeringWheel) {
//	super(vehicleID, vehicleName);
//	this.streeringWheel = streeringWheel;
//}

@Override
public String toString() {
	return "FourWheeler [streeringWheel=" + streeringWheel + "]";
}

public String getStreeringWheel() {
	return streeringWheel;
}

public void setStreeringWheel(String streeringWheel) {
	this.streeringWheel = streeringWheel;
}

public FourWheeler() {
	super();
	// TODO Auto-generated constructor stub
}

//public FourWheeler(int vehicleID, String vehicleName) {
//	super(vehicleID, vehicleName);
//	// TODO Auto-generated constructor stub
//}

}
