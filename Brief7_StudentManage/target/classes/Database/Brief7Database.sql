CREATE TABLE stdManagement(
id SERIAL PRIMARY KEY NOT NULL,
first_name VARCHAR(25) NOT NULL,
last_name VARCHAR(25) NOT NULL,
email VARCHAR(35) NOT NULL,
address VARCHAR(50) NOT NULL,
city VARCHAR(15) NOT NULL,
country VARCHAR(20) NOT NULL
);


INSERT INTO stdManagement(first_name, last_name, email, address, city, country)
	VALUES
	('User1 fName', 'User1 lName', 'user1@user1.ma', 'Somewhere worldwilde N 34352', 'worldwilde', 'Morocco'),
	('User2 fName', 'User2 lName', 'user2@user2.ma', 'Somewhere worldwilde N 34352', 'worldwilde', 'MA'),
	('User3 fName', 'User3 lName', 'user3@user3.ma','Somewhere worldwilde N 34352', 'worldwilde', 'MA far');
	
	
select * from stdManagement;