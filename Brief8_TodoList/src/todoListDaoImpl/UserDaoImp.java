package todoListDaoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javafx.scene.control.Alert;
import todoConnection.TodoConnection;
import todoListDao.Dao;
import todoListEntity.User;

public class UserDaoImp implements Dao<User>{
	
	@Override
	public void create(User user) {
		
		String insertUser = "INSERT INTO users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";

		PreparedStatement preStat;
		try {
			preStat = todoConnect.prepareStatement(insertUser);
			
			preStat.setString(1, user.getFirst_name());
			preStat.setString(2, user.getLast_name());
			preStat.setString(3, user.getUsrename());
			preStat.setString(4, user.getPassword());

			int result = preStat.executeUpdate();

			if (result == 1) {
				
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setTitle("User Registration");
				
				alert.setHeaderText("User Registration");
				alert.setContentText("User Registred Successfully");
				
				alert.showAndWait();
				
			}

			TodoConnection.closePreparedStatement(preStat);
			TodoConnection.closeConnection(todoConnect);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean update(User obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
