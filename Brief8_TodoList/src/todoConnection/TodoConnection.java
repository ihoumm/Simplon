package todoConnection;

import java.sql.Connection;
import java.sql.DriverManager;
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
}
