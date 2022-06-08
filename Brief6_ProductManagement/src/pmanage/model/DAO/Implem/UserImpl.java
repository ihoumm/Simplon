package pmanage.model.DAO.Implem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pmanage.domain.User;
import pmanage.model.DAO.PMDao;
import pmanage.model.DB.ConnectionDB;

public class UserImpl implements PMDao<User> {

	@Override
	public boolean create(User item) throws ClassNotFoundException {
		
		new ConnectionDB();
		// TODO Auto-generated method stub
		Connection connection = ConnectionDB.connect();

		try {
	        PreparedStatement preStat = connection.prepareStatement("INSERT INTO users (id, email, password, fname, lname, approved, created_at, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	        
	        preStat.setInt(1, User.getIdUser());
	        preStat.setString(2, User.getEmail());
	        preStat.setString(3, User.getPassword());
	        preStat.setString(4, User.getFname());
	        preStat.setString(5, User.getLname());
	        preStat.setBoolean(6, User.isApproved());
	        preStat.setString(7, User.getCreated_at());
	        preStat.setString(8, User.getUpdated_at());
	        
	        int i = preStat.executeUpdate();

	      if(i == 1) {
	    	  preStat.close();
			    connection.close();

	        return true;
	      }

	    } catch (SQLException e) {
	        e.printStackTrace();

	    }

		
			return false;
	}

	
	@Override
	public boolean read(int id) throws ClassNotFoundException {
		Connection connection = ConnectionDB.connect();

		try {
		    Statement stat = connection.createStatement();
		    System.out.print(id);
		    ResultSet result = stat.executeQuery("SELECT * FROM users WHERE id=" + id);

		    if(result.next())
		    {
		  	  User user = new User();
		  	  
			  user.setIdUser( result.getInt(id));
			  user.setEmail(result.getString("email"));
			  user.setPassword(result.getString("password"));
			  user.setFname(result.getString("fname"));
			  user.setLname(result.getString("lname"));
			  user.setApproved(result.getBoolean(null));
			  user.setCreated_at(result.getString("created_at"));
			  user.setUpdated_at(result.getString("updated_at"));
		
		    }
		
		return true;
		
		} catch (SQLException e) {
	        e.printStackTrace();

	    }
		return false;
}

	
	@Override
	public boolean update(int id, User item) throws ClassNotFoundException {
		new ConnectionDB();
		// TODO Auto-generated method stub
		Connection connection = ConnectionDB.connect();
		try {
		PreparedStatement state = connection.prepareStatement("UPDATE users SET email=?, password=?, fname=?, lname=?, approved=?, created_at=?, updated_at=? WHERE id=?");
		
		state.setInt(1, User.getIdUser());
		state.setString(2, User.getEmail());
		state.setString(3, User.getPassword());
		state.setString(4, User.getFname());
		state.setString(5, User.getLname());
		state.setBoolean(6, User.isApproved());
		state.setString(7, User.getCreated_at());
		state.setString(8, User.getUpdated_at());
		
		state.setInt(7, id);
		
		int i = state.executeUpdate();
	      if(i == 1) {
	  	    return true;
	      }
		    state.close();
		    connection.close();

		}catch (SQLException e) {
        e.printStackTrace();
		}

    return false;
}
	@Override
	public boolean delete(int id) throws ClassNotFoundException {
		Connection connection = ConnectionDB.connect();

	    try {
	        Statement state = connection.createStatement();
	        int i = state.executeUpdate("DELETE FROM users WHERE id=" + id);

	      if(i == 1) {
	        return true;
	      }
		    state.close();
		    connection.close();

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    
	    return false;
	}



	

	
}
