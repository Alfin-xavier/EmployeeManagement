package com.atmecs.employee_management.operations;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import com.atmecs.employee_management.entity.Employee;
import com.atmecs.employee_management.entity.Skills;
import com.atmecs.employee_management.utility.HibernateUtility;

public class OneToManyMapping 
{
	@Test
	public void addRecord() 
	{

		final Session session = HibernateUtility.getHibernateSession();
		try 
		{
			
			  Transaction transaction = session.beginTransaction();
			  
				Employee employee = new Employee("Jonas", "jesu.jonas@atmecs.com");

				Skills skill1  = new Skills("Good Communication",employee);
				Skills skill2  = new Skills("Leadership",employee);
				Skills skill3  = new Skills("Time Management",employee);
				
				Set<Skills> skill = new HashSet<Skills>();
				skill.add(skill1);
				skill.add(skill2);
				skill.add(skill3);

				employee.setSkill(skill);

			session.save(employee);
			transaction.commit();
		}
		finally 
		{
			session.close();
		}
	}
}
