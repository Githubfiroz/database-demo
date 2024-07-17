package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entiry.Person;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Insert 1 >> {}", repository.save(new Person("Firoz", "Mumbai", new Date())));
		logger.info("Insert 2 >> {}", repository.save(new Person("James", "New York", new Date())));
		logger.info("Insert 3 >> {}", repository.save(new Person("Peter", "Melbourne", new Date())));
		
		logger.info("\n Update 3 >> {}", repository.save(new Person(3, "White", "Cedar Rapids", new Date())));
		repository.deleteById(2);
		
		//logger.info("\n user by name James >> {}", repository.findByName("James"));
		//logger.info("\n user by Location New York >> {}", repository.findByLocation("Mumbai"));
		
		logger.info("\n All users >> {}", repository.findAll());
		
	}

}
