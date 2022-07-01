package task.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import task.dao.UserDao;
import task.databaseConnection.TaskDatabaseConnection;
import task.model.User;

public class UserImplementation<IWebBrowser> implements UserDao{

	@Override
	public boolean create(User user) throws SQLException {
		
		String insertUser = "INSERT INTO users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";

		PreparedStatement preStat;
		try {
			preStat = connection.prepareStatement(insertUser);
			
			preStat.setString(1, user.getFirst_name());
			preStat.setString(2, user.getLast_name());
			preStat.setString(3, user.getUsername());
			preStat.setString(4, user.getPassword());

			int result = preStat.executeUpdate();

			if (result == 1) {
				
				return true;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
//	    try {
//	        Statement stmt = connection.createStatement();
//	        ResultSet rs = stmt.executeQuery("SELECT * FROM users where userid = 1");
//
//	      
//	   	 while ( rs.next() ) {
//	   		 System.out.println(90);
//	   		    System.out.println( rs.getString("username"));
//	        }
//
//	       return true;
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return false;
	    
	    

//		PreparedStatement preparedStatement;
//		try {

//			preparedStatement = connection.();

//			preparedStatement.setString(1, user.getFirst_name());
//			preparedStatement.setString(2, user.getLast_name());
//			preparedStatement.setString(3, user.getUsername());
//			preparedStatement.setString(4, user.getPassword());

//			boolean result = c.executeUpdate("INSERT INTO users (first_name, last_name, username, password) VALUES ('a', 'b', 'c', 'd')");
//
//			if (result) {
//
//				return true;
//			}
			

//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return false;
		
	}
	
	public static int checkLogin(String username, String password) {
		Connection connection = TaskDatabaseConnection.taskConnect();

		if (connection == null) {
			return -1;
		}

		String selectUsers = "SELSCT * FROM users WHERE username=? AND password=?";

		try {
			PreparedStatement preStat = connection.prepareStatement(selectUsers);
			preStat.setString(1, username);
			preStat.setString(2, password);

			ResultSet resultset = preStat.executeQuery();

			while (resultset.next()) {
				return 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 1;
	}

}
