package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cars01")
public class Cars {

	@Id
	@GeneratedValue(generator = "increment")
	int carid;
	float number;
	String name;
	public Cars(float number,String name) {
		super();
		this.number = number;
		this.name = name;
		
	}
	public int getcarid() {
		return carid;
	}
	public void setcarid(int carid) {
		this.carid = carid;
	}
	public float getnumber() {
		return number;
	}
	public void setnumber(float number) {
		this.number= number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Cars() {
		super();
	}
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", number=" + number + ", name=" + name+ "]";
	}
}


