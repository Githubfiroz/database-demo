package com.in28minutes.database.databasedemo.entiry;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

//import lombok.Data;
//@Data
//@Table(name = "person")

@Entity
@NamedQuery(name="find_all_person",query="select p from Person p")
public class Person {
	
	@Id	
	@GeneratedValue   
	private int id;
		
	private String name;
		
	private String location;
		
	private Date birthdate;
	
	public Person() {
		
	}
	
	// For JDBC
	public Person(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}
	
	/* For JPA */
	public Person( String name, String location, Date birthdate) {
		super();
		//JPA generates id in sequence
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", birthdate=" + birthdate + "]";
	}
}
