package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entiry.Person;

//Repository
//Transaction Management

@Repository
@Transactional
public class PersonJpaRepository {

	// Connect to database
	// @PersistenceContext
	// EntityManager entityManager;

	@PersistenceContext
	private EntityManager entityManager;

	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		return namedQuery.getResultList();
	}

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	/*
	 * public Person findByName(String name) { return
	 * entityManager.find(Person.class, name); }
	 * 
	 * public Person findByLocation(String location) { return
	 * entityManager.find(Person.class, location); }
	 */
	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}

}
