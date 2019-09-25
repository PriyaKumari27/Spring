package com.cg.springlab.service;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getData()
	{
		System.out.println("Employee Details");
		System.out.println("-----------------");
		System.out.println("Employee ID :"  +"  "+ this.employeeId);
		System.out.println("Employee Name :"+"  "+ this.employeeName);
		System.out.println("Employee Salary :" +"  "+this.salary);
		System.out.println("Employee BU :"+"  "+this.businessUnit);
		System.out.println("Employee Age: "+"  "+this.age);
	}

}
