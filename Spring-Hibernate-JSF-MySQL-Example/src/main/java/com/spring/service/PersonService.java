package com.spring.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.data.Person;


public class PersonService {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public void register(Person person){
		Session session = sessionFactory.getCurrentSession();
		session.save(person);
    }
}
