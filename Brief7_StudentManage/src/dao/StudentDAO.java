package dao;

import java.sql.Connection;

import connection.DatabaseConnection;
import javafx.collections.ObservableList;
import std.Student;

public interface StudentDAO {
	Connection connect = DatabaseConnection.connect();
	
	public ObservableList<Student> StudentList();
	public void Create(String id, String first_name, String last_name, String Email, String address, String City, String Country);
	public void Update(String id, String first_name, String last_name, String Email, String address, String City, String Country);
	public void Delete(String id);
}
