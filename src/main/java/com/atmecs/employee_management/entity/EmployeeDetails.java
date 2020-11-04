package com.atmecs.employee_management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
    private int eid;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "location")
	private String workLocation;
	
	@Column(name = "hobby")
	private String hobby;
	
	@JoinColumn(name ="empid")
	@OneToOne(cascade = CascadeType.ALL)
	private Employee emp;

	public Employee getEmp() 
	{
		return emp;
	}

	public void setEmp(Employee emp) 
	{
		this.emp = emp;
	}

	public int getEid() 
	{
		return eid;
	}

	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getWorkLocation() 
	{
		return workLocation;
	}

	public void setWorkLocation(String workLocation)
	{
		this.workLocation = workLocation;
	}

	public String getHobby() 
	{
		return hobby;
	}

	public void setHobby(String hobby) 
	{
		this.hobby = hobby;
	}

	public EmployeeDetails(double salary, String workLocation, String hobby) 
	{
		this.salary = salary;
		this.workLocation = workLocation;
		this.hobby = hobby;
	}

	public EmployeeDetails()
	{

	}
	
	
}
