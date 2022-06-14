package stdManageConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import stdManage.entity.Student;

public class DatabaseConnection {

	public static Connection connect() throws ClassNotFoundException {
		String jdbcURL = "jdbc:postgresql://localhost:5432/Brief7_StdManagement";
		String username = "postgres";
		String password = "MustaphaihouM@2609";
		String databaseDriver = "org.postgresql.Driver";
		
		try {			
			
		//	System.out.println("Successfully Connected to PostgreSQL server");
			Class.forName(databaseDriver);
			return  DriverManager.getConnection(jdbcURL, username, password);

			
			
		} catch (SQLException e) {
			System.out.println("Sorry!! Not Connected to the server");
			e.printStackTrace();
		}
		
		return null;
	}
	
}
