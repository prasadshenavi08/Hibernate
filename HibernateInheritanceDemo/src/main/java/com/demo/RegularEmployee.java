package com.demo;

public class RegularEmployee extends Employee{
	float salary;
	float bonus;
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public RegularEmployee(int id, String name, float salary, float bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public RegularEmployee(int id, String name) {
		super(id, name);
	}
	
	
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
}
