package com.rhpsoft.hibernate.core.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rhpsoft.hibernate.core.beans.Employee;

public class HibernateExampleTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setFirstName("srk");
		emp.setLastName("ganji");
		emp.setEmail("sravan@rhpsoft.com");
		emp.setHireDate(new Date());
		emp.setSalary(4561);
		emp.setDepartmentId(60);//Set to IT Department
		emp.setJobId("IT_PROG");
		
		session.save(emp);
		
		/*
		emp.setEmail("rk@rhpsoft.com");
		emp.setLastName("Paturu");
		*/
		
		session.getTransaction().commit();
		
		session.close();
		
		
		
	}

}
