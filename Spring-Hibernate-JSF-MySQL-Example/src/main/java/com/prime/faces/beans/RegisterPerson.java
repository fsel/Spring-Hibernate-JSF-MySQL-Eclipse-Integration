package com.prime.faces.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.hibernate.data.Person;
import com.spring.service.PersonService;


public class RegisterPerson {
	
	
	private PersonService personService;
	
	private Person person = new Person();
	
	public PersonService getPersonService(){
		return personService;
	}
	
	public void setPersonService(PersonService personService){
		this.personService = personService;
	}
	
	public Person getPerson(){
		return person;
	}
	
	public void setPerson(Person person){
		this.person = person; 
	}
	
	public String register(){
		personService.register(person);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("The Person " +this.person.getFirstName() + this.person.getLastName() + " is registered successfully."));
		return "";
	}

}
