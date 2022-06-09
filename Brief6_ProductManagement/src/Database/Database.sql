create table Users (

	UserId int primary key,
	FirstName varchar(50),
	LastName varchar(50),
	Email varchar(50),
	City varchar(50),
	Country varchar(50)
);



select * from Products where IdCategory = 2;

Create table Products(
	IdProduct int Primary key,
	ProductName varchar(40),
	CategoName varchar(40),
	Stock int,IdCategory int,
	foreign key (IdCategory) references Categories(IdCategory) 
);



Create table Categories(
	IdCategory int Primary key,
	CategoryName varchar(40)
);


select * from Users;
select * from Products;
select * from Categories;