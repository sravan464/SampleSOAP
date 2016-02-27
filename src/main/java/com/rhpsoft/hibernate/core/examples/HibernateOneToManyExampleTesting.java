package com.rhpsoft.hibernate.core.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rhpsoft.hibernate.core.beans.Country;
import com.rhpsoft.hibernate.core.beans.Regions;

public class HibernateOneToManyExampleTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        //Creating country objects
        Country country1=new Country("T1","TestCountryBI1");
        Country country2=new Country("T2","TestCountryBI2");
        Country country3=new Country("T3","TestCountryBI3");
        
        //Creating region
        Regions region=new Regions();
        region.setRegionName("SR");
        
        country1.setRegion(region); 
        country2.setRegion(region); 
        country3.setRegion(region); 
        
        Set countrySet= new HashSet<Country>();
        countrySet.add(country1);
        countrySet.add(country2);
        countrySet.add(country3);
        
      region.setCountrySet(countrySet);
        session.save(region);
        session.getTransaction().commit();
		session.close();
        
        

	}

}
