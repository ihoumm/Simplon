package com.managestds.dao;

import java.sql.*;
import java.util.Set;

public class StudentsDaoImp implements StudentsDao {

	@Override
	public boolean createStudent(Student student) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = new DBConnection().connect();

		try {
	        PreparedStatement stmt = connection.prepareStatement("INSERT INTO students (email, fname, lname, address, city, country) VALUES (?, ?, ?, ?, ?, ?)");
	        stmt.setString(1, student.getEmail());
	        stmt.setString(2, student.getfName());
	        stmt.setString(3, student.getlName());
	        stmt.setString(4, student.getAddress());
	        stmt.setString(5, student.getCity());
	        stmt.setString(6, student.getCountry());
	        int i = stmt.executeUpdate();

	      if(i == 1) {
			    stmt.close();
			    connection.close();

	        return true;
	      }

	    } catch (SQLException e) {
	        e.printStackTrace();

	    }

		
return false;

	}
	
	public Student readStudent(int id) throws ClassNotFoundException {
		
		Connection connection = DBConnection.connect();

		try {
		    Statement stmt = connection.createStatement();
		    System.out.print(id);
		    ResultSet result = stmt.executeQuery("SELECT * FROM students WHERE id=" + id);

		    if(result.next())
		    {
		  	  Student student = new Student();
			  student.setUserId( result.getInt("id") );
			  student.setEmail( result.getString("email") );
			  student.setfName( result.getString("fname") );
			  student.setlName( result.getString("lname") );
			  student.setAddress( result.getString("address") );
			  student.setCity( result.getString("city") );
			  student.setCountry( result.getString("country") );
			    
			  System.out.print(student);

			  return student;
		    }

		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

		return null;
		}

	public boolean updateStudent(int id, Student student) throws ClassNotFoundException {
		 Connection connection = DBConnection.connect();

		    try {
		        PreparedStatement stmt = connection.prepareStatement("UPDATE students SET email=?, fname=?, lname=?, address=?, city=?, country=? WHERE id=?");
		        stmt.setString(1, student.getEmail());
		        stmt.setString(2, student.getfName());
		        stmt.setString(3, student.getlName());
		        stmt.setString(4, student.getAddress());
		        stmt.setString(5, student.getCity());
		        stmt.setString(6, student.getCountry());
		        stmt.setInt(7, id);

		        int i = stmt.executeUpdate();
		      if(i == 1) {
		  	    return true;
		      }
			    stmt.close();
			    connection.close();

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return false;
		}
	
	public boolean deleteStudent(int id) throws ClassNotFoundException {
		 Connection connection = DBConnection.connect();

		    try {
		        Statement stmt = connection.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM students WHERE id=" + id);

		      if(i == 1) {
		        return true;
		      }
			    stmt.close();
			    connection.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return false;
		}


}


	
	
