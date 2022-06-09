package impl;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.DAO;
import domain.User;
import pmanage.model.DB.DBConnect;

public  class UserDAOImpl  implements DAO<User>{
	private static final int UserId = 0;


		@Override
		public User read(int id) {


			return null;
		}
		
		//CREAT User
		@Override
		public boolean create(User user) throws SQLException {
			String insertSql = "INSERT INTO Users (UserId, FirstName, LastName, Email, City, Country) VALUES (?, ?, ?, ?,?,?)";
			
			PreparedStatement preStat = connect.prepareStatement(insertSql);
			
				preStat.setInt(1, user.getUserId());
				preStat.setString(2, user.getFirstName());
				preStat.setString(3, user.getLastName());
				preStat.setString(4, user.getEmail());
				preStat.setString(5, user.getCity());
				preStat.setString(6, user.getCountry());
			
		int result = preStat.executeUpdate();
		
		if(result == 1) {
			return  true;
		}
			
						DBConnect.closePreparedStatement(preStat);
						DBConnect.closeConnection(connect);
						
			return false;
			
		}
		
		//Read

		@Override
	public List<User> getAll() {
			List<User> ListerUsers = new ArrayList<>();
		try {
			String selectSql = "SELECT *  FROM Users";
			Statement preStat = connect.createStatement();
			ResultSet result = preStat.executeQuery(selectSql);

			while (result.next()) {
				User user = new User();
				user.setUserId(result.getInt("UserId"));
				user.setFirstName(result.getString("FirstName"));
				user.setLastName(result.getString("LastName"));
				user.setEmail(result.getString("Email"));
				user.setCity(result.getString("City"));
				user.setCountry(result.getString("Country"));
				ListerUsers.add(user);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return ListerUsers;
		}

	public boolean getById(int id) {
		
			
			try {
				Statement preStat = connect.createStatement();
		
		
			System.out.println(id);
			ResultSet result = preStat.executeQuery("SELECT *FROM Users WHERE UserId ="+ id);
				 if (result.next()) {
					return true;
				 }
				 
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	
    //Update
		@Override
		public boolean update(int id, User user) throws SQLException {
	
				String updateSql = "UPDATE Users set UserId = ?, FirstName = ?, LastName = ?, Email = ?, City = ?, Country = ? where UserId = ?";
				
				PreparedStatement preStat = connect.prepareStatement(updateSql);
				
				preStat.setInt(1, user.getUserId());
				preStat.setString(2, user.getFirstName());
				preStat.setString(3, user.getLastName());
				preStat.setString(4, user.getEmail());
				preStat.setString(5, user.getCity());
				preStat.setString(6, user.getCountry());
				preStat.setInt(7, id);
				int result = preStat.executeUpdate();
				
				if(result == 1) {
					return  true;
				}
								DBConnect.closePreparedStatement(preStat);
								DBConnect.closeConnection(connect);
								
					return false;
					
				}

	//Delete
	
		@Override
		 public boolean delete(int id) {

		    try {
		        Statement preStat = connect.createStatement();
		        int i = preStat.executeUpdate("DELETE FROM Users WHERE UserId=" + id);

		      if(i == 1) {
		        return true;
		      }
		      preStat.close();
			    connect.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return false;
		}	

		

		}

