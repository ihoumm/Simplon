package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection connect() {
		String jdbcURL = "jdbc:postgresql://localhost:5432/Brief7_StdManagement";
		String username = "postgres";
		String password = "MustaphaihouM@2609";
		String databaseDriver = "org.postgresql.Driver";
		
		try {			
			
		//	System.out.println("Successfully Connected to PostgreSQL server");
			Class.forName(databaseDriver);
			return  DriverManager.getConnection(jdbcURL, username, password);

			
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Sorry!! Not Connected to the server");
			e.printStackTrace();
		}
		
		return null;
	}
}
