create table users(
userId SERIAL PRIMARY KEY NOT NULL,
first_name VARCHAR(25) NOT NULL,
last_name VARCHAR(25) NOT NULL,
username VARCHAR(25) NOT NULL,
password VARCHAR(50) NOT NULL
);

insert into users(first_name, last_name, username, password)
	values
	('mustapha', 'ihoum', 'ihoum', 'root'),
	('default', 'user', 'admin', 'admin');

select * from users;

create table category(
categoryId Integer PRIMARY KEY NOT NULL,
categoryName VARCHAR(25) NOT NULL
);

insert into category (categoryId, categoryName)
	Values
	(1, 'Presentation'),
	(2, 'Veille'),
	(3, 'Recherche'),
	(4, 'Briefs');

select * from category;

create table todoList(
todoId SERIAL PRIMARY KEY NOT NULL,
title VARCHAR(100) NOT NULL,
description VARCHAR(255) NOT NULL,
status VARCHAR(25) NOT NULL,
deadline VARCHAR(25) NOT NULL,
categoryId Integer,
foreign key (categoryId) references category(categoryId) 
);

drop table todolist;

insert into todolist(title, description, status, deadline, categoryId)
	values
	('Brief 8', 'Make todo list', 'in progress', '21 June at 18h00', 4);


select * from todoList;