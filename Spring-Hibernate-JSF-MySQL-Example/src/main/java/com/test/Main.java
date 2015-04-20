package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.data.Person;

public class Main {
	public static void main(String [] args){
		
		Configuration configuration = new Configuration();
        System.out.println("CFG and hbm files loaded successfully.");//just to test
        
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        
        Session session = factory.openSession();
        
        Transaction tx = session.getTransaction();
        tx.begin();
        System.out.println("Transaction began");//just to test
        
        Person newPerson = new Person();
        newPerson.setFirstName("aa");
        newPerson.setLastName("bbb");
        newPerson.setGender("Male");
        newPerson.setAge(2);
        
        session.save(newPerson);
        session.flush();
        
        tx.commit();
        session.close();
        System.out.println("Session closed");//just to test
    
	}
}
