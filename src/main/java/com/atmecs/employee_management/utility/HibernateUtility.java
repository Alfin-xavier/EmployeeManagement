package com.atmecs.employee_management.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.employee_management.entity.Employee;
import com.atmecs.employee_management.entity.EmployeeDetails;
import com.atmecs.employee_management.entity.Skills;

public class HibernateUtility 
{
	public static Session getHibernateSession()
	{
		final SessionFactory factory = new Configuration().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(EmployeeDetails.class).addAnnotatedClass(Skills.class)
		        .configure("hibernate.cfg.xml").buildSessionFactory();
		
		final Session session = factory.openSession();
		
	    return session;
	}
}
