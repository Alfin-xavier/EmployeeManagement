package com.atmecs.employee_management.operations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import com.atmecs.employee_management.entity.Employee;
import com.atmecs.employee_management.entity.Skills;
import com.atmecs.employee_management.utility.HibernateUtility;

public class ManyToManyMapping 
{
	@Test
	public void addDetails()
	{
		final Session session = HibernateUtility.getHibernateSession();
		try 
		{
			
			  Transaction transaction = session.beginTransaction();
			  
				Skills skill1 = new Skills("Good Communication");
				Skills skill2 = new Skills("Leadership");
				//Skills skill3 = new Skills("Time Management");
				

				Employee emp1 = new Employee("Vaishak", "vaishak.bala@atmecs.com");
				Employee emp2 = new Employee("Shane", "shanealfin@gmail.com");

				skill1.setEmployee(emp1);
				skill1.setEmployee(emp2);
				skill2.setEmployee(emp2);
				/*
				 * team_det1.addProject(project_det2); team_det2.addProject(project_det1);
				 */
				/*
				 * project_det1.addTeam(team_det1); project_det1.addTeam(team_det2);
				 * project_det2.addTeam(team_det2);
				 */
				
				
				  session.save(skill1); session.save(skill2);
				 
			transaction.commit();
		}
		finally 
		{
			session.close();
		}
	}
}
