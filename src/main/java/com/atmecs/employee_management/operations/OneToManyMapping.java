package com.atmecs.employee_management.operations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;
import com.atmecs.employee_management.utility.HibernateUtility;

public class OneToManyMapping 
{
	/*
	 * @Test public void addRecord() {
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * 
	 * final Session session = HibernateUtility.getHibernateSession(); try {
	 * 
	 * Transaction transaction = session.beginTransaction();
	 * 
	 * Employee emp = new Employee("SDET");
	 * 
	 * Employee_Details emp_det1 = new Employee_Details("Alfin",
	 * "alfin.anthonyraj@atmecs.com.com", team_det); Employee_Details emp_det2 = new
	 * Employee_Details("Padma", "padma.inba@gmail.com", team_det); Employee_Details
	 * emp_det3 = new Employee_Details("Vasu", "vasu.vanu@gmail.com", team_det);
	 * 
	 * Set<Employee_Details> employee_det = new HashSet<Employee_Details>();
	 * employee_det.add(emp_det1); employee_det.add(emp_det2);
	 * employee_det.add(emp_det3);
	 * 
	 * team_det.setEmployee_det(employee_det);
	 * 
	 * session.save(team_det); transaction.commit(); } finally { session.close(); }
	 * }
	 */
}
