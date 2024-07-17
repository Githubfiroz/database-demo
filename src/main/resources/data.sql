
Create table person (
	id integer not null,
	name varchar(20) not null,
	location varchar(20),
	birthdate timestamp,
	primary key(id)
);


insert into person (id, name, location, birthdate) values(10001, 'Firoz', 'Mumbai', sysdate());
insert into person (id, name, location, birthdate) values(10002, 'James', 'New York', sysdate());
insert into person (id, name, location, birthdate) values(10003, 'Peter', 'Melbourne', sysdate());

--insert into person (id, name, location, birthdate) values(10004, 'James', 'Chicago', sysdate());
--insert into person (id, name, location, birthdate) values(10005, 'John', 'New York', sysdate());
