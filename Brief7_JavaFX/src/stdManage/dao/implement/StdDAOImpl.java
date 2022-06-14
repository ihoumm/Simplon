package stdManage.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javafx.scene.control.Alert;
import stdManage.dao.StdDAO;
import stdManage.entity.Student;
import stdManageConnection.DatabaseConnection;

public class StdDAOImpl implements StdDAO {
	Statement statement;
	@Override
	public boolean Create(Student student) throws ClassNotFoundException, SQLException {
		
		Connection Connect = new DatabaseConnection().connect();
		
		
		PreparedStatement preStat  = Connect.prepareStatement("INSERT INTO stdManagement (email, first_name, last_name,  city, country) VALUES (?, ?, ?, ?, ?)");
		
			preStat.setString(3, student.getEmail());
			preStat.setString(1, student.getFirst_name());
			preStat.setString(2, student.getLast_name());
			preStat.setString(4, student.getCity());
			preStat.setString(5, student.getCountry());
			
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setTitle("Student Registration");
			
			alert.setHeaderText("Student Registration");
			alert.setContentText("Student Added Successfully");
			
			alert.showAndWait();

		
	int result = preStat.executeUpdate();
	
	if(result == 1) {
		return  true;
	}
		
		return false;
}
	@Override
	public boolean Update(int id, Student student) throws ClassNotFoundException {
		Connection connection = DatabaseConnection.connect();
		

	    try {
	        PreparedStatement preStat = connection.prepareStatement("UPDATE stdManagement SET email=?, first_name=?, last_name=?, address=?, city=?, country=? WHERE id=?");
	        
	        preStat.setString(1, student.getFirst_name());
			preStat.setString(2, student.getLast_name());
			preStat.setString(3, student.getEmail());
			preStat.setString(4, student.getCity());
			preStat.setString(5, student.getCountry());
			
			preStat.setInt(7, id);

		    
		    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setTitle("Student Registration");
			
			alert.setHeaderText("Student Registration");
			alert.setContentText("Student Updated Successfully");
			
			alert.showAndWait();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return false;
	}

	@Override
	public boolean Delete(int id) throws ClassNotFoundException {
		return false;
		
	
	}
	@Override
	public List<Student> showStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}
