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
@Table(name = "employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mail")
	private String mail;
	
	@JoinColumn(name ="p_id")
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeDetails empdet;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getMail() 
	{
		return mail;
	}

	public void setMail(String mail) 
	{
		this.mail = mail;
	}

	public EmployeeDetails getEmpdet() 
	{
		return empdet;
	}

	public void setEmpdet(EmployeeDetails empdet)
	{
		this.empdet = empdet;
	}

	public Employee(String name, String mail, EmployeeDetails empdet) 
	{
		this.name = name;
		this.mail = mail;
		this.empdet = empdet;
	}

	public Employee() 
	{

	}
	
}