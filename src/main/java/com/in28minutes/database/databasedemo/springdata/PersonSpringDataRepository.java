package com.in28minutes.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.database.databasedemo.entiry.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
