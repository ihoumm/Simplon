package com.managestds.dao;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		StudentsDaoImp studentDaoImp = new StudentsDaoImp();
		Student std  = new Student("student9@user.ma", "Student9", "user9", "123 Main Street, Agadir, Souss-Massa 10030", "Agadir", "Morocco");
		if(studentDaoImp.createStudent(std)) {
		System.out.print("Student added Successfuly \r\n\r\n");
		} else{
		System.out.print("wakuk!");
		}
		System.out.print(studentDaoImp.readStudent(1));
		Student stdUpdated  = new Student("student@user.ma", "Someone", "unkown", "BT 67 Main Street, Tiznit, Souss-Massa 10030", "Tizinit", "Morocco");
		System.out.print("Student updated Successfuly \\r\\n\\r\\n");
		System.out.print("Error!\\r\\n\\r\\n");
		System.out.print(studentDaoImp.deleteStudent(19));
}
		
		
		
		
		/* Add New Student
		 * 
		 Student std  = new Student("student6@user.ma", "Student6", "user6", "123 Main Street, Essouira, Souss-Massa 10030", "Essouira", "Morocco");
			
			if(studentDaoImp.createStudent(std)) {
				System.out.print("Student added Successfuly");
			} else{
				System.out.print("wakuk!");
			} 
		 * 
		 */
		
		/*Read/Show Students
		 * 
		 * System.out.print(studentDaoImp.readStudent(1));
		 * 
		 */
		
		/*Update Students
		 * 
		  Student stdUpdated  = new Student("firststudent@user.ma", "Someone", "unkown", "BT 67 Main Street, Tiznit, Souss-Massa 10030", "Tizinit", "Morocco");
		
			if(studentDaoImp.updateStudent(1, stdUpdated)) {
				System.out.print("Student updated Successfuly");
			} else{
				System.out.print("Error!");
			} 
		 * 
		 */
		
		/* Delete Students
		 * 
		 * System.out.print(studentDaoImp.deleteStudent(19));
		 * 
		 */
		
	}
	
