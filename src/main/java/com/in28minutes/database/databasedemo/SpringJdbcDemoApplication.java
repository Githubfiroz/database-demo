package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("\n All users PersonRowMapper >> {}", dao.findAll());
		/*
		logger.info("\n All users >> {}", dao.findAll());
		logger.info("\n user id 10001 >> {}", dao.findById(10001));
		logger.info("\n user by name James >> {}", dao.findByName("James"));
		logger.info("\n user by Location New York >> {}", dao.findByLocation("New York"));
		*/
		//logger.info("\n user id 10003 no. of rows deleted >> {}", dao.deleteById(10003));
		//Person person = new Person(10008,"Jennifer","Louisville",new Date());
		//logger.info("Insert 10008 >> {}", dao.insert(new Person(10008,"Jennifer","Louisville",new Date() ) ));
		//10004	James	Chicago	2022-05-17 00:00:00
		//logger.info("Update 10004 >> {}", dao.update(new Person(10004,"James","Cedar Rapids",new Date() ) ));
		
	}

}
