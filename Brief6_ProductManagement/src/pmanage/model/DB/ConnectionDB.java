package pmanage.model.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	public static Connection connect() throws ClassNotFoundException {
		String jdbcURL = "jdbc:postgresql://localhost:5432/std_inscriptions";
		String username = "postgres";
		String password = "MustaphaihouM@2609";
		String databaseDriver = "org.postgresql.Driver";
		
		try {
			Class.forName(databaseDriver);
			return  DriverManager.getConnection(jdbcURL, username, password);
		} catch (SQLException e) {
			System.out.println("Sorry!! Not Connected to the server");
			e.printStackTrace();
		}
		
		return null;
	}



}
