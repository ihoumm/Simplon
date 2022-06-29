package todoConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoConnection {
	public static Connection todoConnect() {
		String jdbcURL = "jdbc:postgresql://localhost:5432/TodoList";
		String username = "postgres";
		String password = "MustaphaihouM@2609";
		String databaseDriver = "org.postgresql.Driver";
		
		try {
			Class.forName(databaseDriver);
			return  DriverManager.getConnection(jdbcURL, username, password);

			
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Sorry!! Not Connected to the server");
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static int checkLogin(String username, String password) {
		Connection connection = TodoConnection.todoConnect();
		if (connection == null) {
			return-1;
		}
		
		String selectUsers = "SELSCT * FROM users WHERE username=? AND password=?";
		
		try {
			PreparedStatement preStat = connection.prepareStatement(selectUsers);
			preStat.setString(1, username);
			preStat.setString(2, password);
			
			ResultSet resultset = preStat.executeQuery();
			
			while(resultset.next()) {
				return 0;
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 1;
	}

	public static void closePreparedStatement(PreparedStatement preStat) {
		// TODO Auto-generated method stub
		
	}

	public static void closeConnection(Connection todoconnect) {
		// TODO Auto-generated method stub
		
	}
}
