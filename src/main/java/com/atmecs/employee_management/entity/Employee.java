package com.atmecs.employee_management.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "empid")
	private Set<Skills> skill;
	
	public int getId() 
	{
		return id;
	}

	public Set<Skills> getSkill() 
	{
		return skill;
	}

	public void setSkill(Set<Skills> skill) 
	{
		this.skill = skill;
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

	public Employee(String name, String mail) 
	{
		this.name = name;
		this.mail = mail;
	}

	public Employee(String name, String mail, Set<Skills> skill)
	{
		this.name = name;
		this.mail = mail;
		this.skill = skill;
	}

}
