package com.learning.core.day6;

public class Employee {
	private int id;
	private String name;
	private String Department;
	private String Designation;
	public Employee(int id,String name,String Department,String Designation) {
		this.id=id;
		this.name=name;
		this.Department=Department;
		this.Designation=Designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String toString() {
		return this.getId()+" "+this.getName()+" "+this.getDepartment()+" "+this.getDesignation();
	}
}
