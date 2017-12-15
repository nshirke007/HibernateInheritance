package com.scp.HibernateDemo1.InhiretanceInhibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="VehicleTest")
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="typeofvehicle",discriminatorType=DiscriminatorType.STRING) 
//@DiscriminatorValue(value="Vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int vehicleID;
	@Column
	String vehicleName;

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", vehicleName=" + vehicleName + "]";
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Vehicle(int vehicleID, String vehicleName) {
		super();
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

}
