package com.managestds.dao;


public interface StudentsDao {
	
	//CRUD	
	boolean createStudent(Student student) throws ClassNotFoundException;
	
	Student readStudent(int id) throws ClassNotFoundException;

	boolean updateStudent(int id, Student student) throws ClassNotFoundException;

	boolean deleteStudent(int id) throws ClassNotFoundException;

}
