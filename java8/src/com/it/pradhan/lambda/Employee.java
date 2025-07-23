//Task-1 : Print emp names who are working in Hyd location in DB team.

package com.it.pradhan.lambda;

public class Employee {
	
	String name;
	String location;
	String dept;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
	
	
	

}
