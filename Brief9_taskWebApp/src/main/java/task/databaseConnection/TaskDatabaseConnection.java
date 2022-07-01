package task.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskDatabaseConnection {
	
	public static Connection taskConnect() {
		
		String jdbcURL = "jdbc:postgresql://localhost:5432/TodoList";
		String username = "postgres";
		String password = "MustaphaihouM@2609";
		String databaseDriver = "org.postgresql.Driver";
		
		try {
			Class.forName(databaseDriver);
			
			Connection conn = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("wa5dm l3fouuuuuuu!");
			return conn;

			
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Sorry!! Not Connected to the server");
			e.printStackTrace();
		}
		
		return null;
	}
}