package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	    
	 public static Connection getConnection() {
		 
		 
		 String host = "jdbc:postgresql://localhost:5432/cickitDB"; 
		 String user = "postgres"; 
		 String pass = "MustaphaihouM@2609"; 
		 String driverName = "org.postgresql.Driver"; 

		 try{ 
			 Class.forName(driverName);
			 return DriverManager.getConnection(host, user, pass);
			

		 }catch(SQLException | ClassNotFoundException e){
			 e.printStackTrace();
	         System.out.println("Error Opening DB!");
			 
		 }
		 return null;
	 }
   
}
