package com.managestds.dao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		//Add new Student
		StudentsDaoImp studentDaoImp = new StudentsDaoImp();
		
		Student std  = new Student("student9@user.ma", "Student9", "user9", "123 Main Street, Agadir, Souss-Massa 10030", "Agadir", "Morocco");
		
		if(studentDaoImp.createStudent(std)) {
		System.out.print("Student added Successfuly \r\n\r\n");
		} else{
		System.out.print("wakuk!");
		}
		
		//Read Student
		System.out.print(studentDaoImp.readStudent(1));
		
		
		//Update Student
		Student stdUpdated  = new Student("student@user.ma", "Someone", "unkown", "BT 67 Main Street, Tiznit, Souss-Massa 10030", "Tizinit", "Morocco");
		System.out.print("Student updated Successfuly \\r\\n\\r\\n");
		System.out.print("Error!\\r\\n\\r\\n");
		
		//Delete Student
		System.out.print(studentDaoImp.deleteStudent(19));
	}
		
	
		
}
	
