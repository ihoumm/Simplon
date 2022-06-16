package impl;

import java.sql.ResultSet;
import java.sql.Statement;

import dao.StudentDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import std.Student;

public class StudentDaoImpl implements StudentDAO {
	
	
	Statement stat;
	@Override
	public ObservableList<Student> StudentList() {
		
		 ObservableList<Student> studentList = FXCollections.observableArrayList();
		 
	        String read = "SELECT * FROM stdmanagement";
	        
			ResultSet result;
		        
		        try{
		            stat = connect.createStatement();
		            result = stat.executeQuery(read);
		            Student student;
		            while(result.next()){
		                student = new Student(
			                		result.getInt("id"),
			                		result.getString("first_name"),
			                		result.getString("last_name"),
			                		result.getString("email"),
			                		result.getString("address"),
			                		result.getString("city"),
			                		result.getString("country"));
		                
		                studentList.add(student);
		            }
		                
		        }catch(Exception ex){
		            ex.printStackTrace();
		        }
		        return studentList;
	}

	@Override
	public void Create(String id, String first_name, String last_name, String Email, String address, String City,
			String Country) {
		String insert = "INSERT INTO stdmanagement VALUES (" 
			+ id + ",'" 
			+ first_name + "','" 
			+ last_name + "','" 
			+ Email + "','" 
			+ address + "','" 
			+ City + "','" 
			+ Country + "')";
	       
		try{
			stat = connect.createStatement();
			stat.executeUpdate(insert);
			
		}catch(Exception ex){
            ex.printStackTrace();
        }
	}

	@Override
	public void Update(String id, String first_name, String last_name, String Email, String address, String City,
			String Country) {
		
		 String query = "UPDATE stdmanagement SET id = '" + id + "', "
		 		+ "first_name = '" + first_name + "',"
		 		+ "last_name = '" + last_name +"',"
		 		+ "email = '" + Email + "', "
		 		+ "address = '" + address + "', "
		 		+ "city = '" +City + "', "
		 		+ "country = '" + Country + "' "
		 		+ "WHERE id =  "+ id;
		try{
			stat = connect.createStatement();
			stat.executeUpdate(query);
			
		}catch(Exception ex){
            ex.printStackTrace();

        }
		
	}

	@Override
	public void Delete(String id) {
		String delete = "DELETE FROM stdmanagement WHERE id =" + id ;
        
		try{
			stat = connect.createStatement();
			stat.executeUpdate(delete);
			
			
		}catch(Exception ex){
            ex.printStackTrace();
		}
	
	}
}
