package com.rhpsoft.hibernate.core.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rhpsoft.hibernate.core.beans.Country;
import com.rhpsoft.hibernate.core.beans.Employee;
//import com.rhpsoft.hibernate.core.beans.EmployeeDetail;
import com.rhpsoft.hibernate.core.beans.Regions;

public class HibernateExampleOnetoOneTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        
       
        
        Regions region=new Regions();
        region.setRegionName("AP");
        
        Country country=new Country();
        country.setCountryId("T2");
        country.setCountryName("India");
//        country.setRegion(region);
        region.setCountry(country);
        
        session.save(country);
        
        
        
        /*
        EmployeeDetail empDetail=new EmployeeDetail();
        empDetail.setAddress1("4900 Hopyard Rd");
        empDetail.setAddress2("Suite 101");
        empDetail.setCity("Pleasanton");
        empDetail.setState("CA");
        empDetail.setCountry("US");
        
        
        Employee emp=new Employee();
		emp.setFirstName("RishiReddy1");
		emp.setLastName("Kanchi");
		emp.setEmail("rr2@rhpsoft.com");
		emp.setHireDate(new Date());
		emp.setSalary(100000);
		emp.setDepartmentId(60);//Set to IT Department
		emp.setJobId("IT_PM");
		
		emp.setEmployeeDetail(empDetail);
		empDetail.setEmployee(emp);
		
		session.save(emp);
		
		*/
        session.getTransaction().commit();
		
		session.close();

	}

}
