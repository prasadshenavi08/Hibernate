package com.demo; 
 
//POJO class (Plain Old Java Object 
public class Employee { 
 int empid; 
 String name; 
 float salary; 
  
 public int getEmpid() { 
  return empid; 
 } 
 public void setEmpid(int empid) { 
  this.empid = empid; 
 } 
 public String getName() { 
  return name; 
 } 
 public void setName(String name) { 
  this.name = name; 
 } 
 public float getSalary() { 
  return salary; 
 } 
 public void setSalary(float salary) { 
  this.salary = salary; 
 } 
 public Employee(int empid, String name, float salary) { 
  super(); 
  this.empid = empid; 
  this.name = name; 
  this.salary = salary; 
 } 
 public Employee() { 
  super(); 
 } 
 @Override 
 public String toString() { 
  return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]"; 
 } 
}