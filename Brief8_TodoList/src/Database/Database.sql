create table users(
userId SERIAL PRIMARY KEY NOT NULL,
first_name VARCHAR(25) NOT NULL,
last_name VARCHAR(25) NOT NULL,
username VARCHAR(25) NOT NULL,
password VARCHAR(50) NOT NULL
);

create table todoList(
todoId SERIAL PRIMARY KEY NOT NULL,
title VARCHAR(100) NOT NULL,
description VARCHAR(255) NOT NULL,
status VARCHAR(25) NOT NULL,
deadline VARCHAR(25) NOT NULL,
categoryId Integer,
foreign key (categoryId) references category(categoryId) 
);

create table category(
categoryId Integer PRIMARY KEY NOT NULL,
categoryName VARCHAR(25) NOT NULL
);

insert into category (categoryId, categoryName)
	Values
	(1, 'Presentation'),
	(2, 'Veille'),
	(3, 'Recherche');
	
delete from category where categoryId=3;

select * from users;
select * from todoList;
select * from category;