package com.rhpsoft.hibernate.core.examples;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * This util class provides generic utility and commonly used methods for Hibernate.
 */
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	//return new Configuration().configure('src/main/resources/hibernate.cfg.xml').buildSessionFactory();
            return new Configuration().configure().buildSessionFactory();
            
        }
        catch (Throwable ex) {
        	ex.printStackTrace();
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
