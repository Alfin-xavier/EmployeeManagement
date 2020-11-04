package com.atmecs.employee_management.operations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import com.atmecs.employee_management.entity.Employee;
import com.atmecs.employee_management.entity.EmployeeDetails;
import com.atmecs.employee_management.utility.HibernateUtility;

public class OneToOneMapping 
{
	@Test
	public void oneToOneMapping() 
	{

		Scanner scan = new Scanner(System.in);
		
		final Session session = HibernateUtility.getHibernateSession();
		try {
			Transaction transaction = session.beginTransaction();

			System.out.println("Enter the number of employees you want to Add :");

			int quantity = scan.nextInt();

			for (int i = 1; i <= quantity; i++) 
			{
				System.out.println("Enter the no.of details :" + i+"\n");

				System.out.println("Enter the Employee Name :");
				String name = scan.next();
				System.out.println("Enter the Mail:");
				String mail = scan.next();

				System.out.println("Enter the Salary:");
				double salary = scan.nextDouble();
				System.out.println("Enter Work location: ");
				String location = scan.next();
				System.out.println("Enter Hobby: ");
				String hobby = scan.next();
				
				Employee emp = new Employee();
				
				emp.setName(name);
				emp.setMail(mail);
				emp.setEmpdet(new EmployeeDetails(salary,location,hobby));
				
				session.save(emp);
				System.out.println(emp);

			}
			transaction.commit();
		} 
		finally 
		{
			session.close();
		}
	}
}
