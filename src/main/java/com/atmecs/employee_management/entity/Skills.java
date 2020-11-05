package com.atmecs.employee_management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY )
	  @Column(name = "id")
	  private int id;
	  
	  @Column(name = "skillname")
	  private String skill;
	  
	  @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "employeeid")
	  private Employee employee;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getSkill() 
	{
		return skill;
	}

	public void setSkill(String skill) 
	{
		this.skill = skill;
	}

	public Employee getEmployee() 
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public Skills() 
	{

	}

	public Skills(String skill, Employee employee) 
	{
		this.skill = skill;
		this.employee = employee;
	}

	public Skills(String string)
	{

	}

	
	/*
	 * public void addEmployee(Set<Employee> employee) { if(this.employee==null)
	 * this.employee = new HashSet<>(); this.employee.add(employee); }
	 */
	  
	  //project_det.addTeam(this); }
	   
}
