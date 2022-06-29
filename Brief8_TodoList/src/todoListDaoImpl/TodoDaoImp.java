package todoListDaoImpl;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Alert;
import todoConnection.TodoConnection;
import todoListDao.Dao;
import todoListEntity.TodoList;

public class TodoDaoImp implements Dao<TodoList> {

	@Override
	public void create(TodoList todolist) {
		String insertTask = "INSERT INTO todolist (title, description, categoryId, status, deadline) VALUES (?, ?, ?, ?, ?)";

		PreparedStatement preStat;
		try {
			preStat = todoConnect.prepareStatement(insertTask);

			preStat.setString(1, todolist.getTitle());
			preStat.setString(2, todolist.getDescription());
			preStat.setInt(3, todolist.getCategoryId());
			preStat.setString(4, todolist.getStatus());
			preStat.setString(5, todolist.getDeadline());

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
	public boolean update(TodoList todolist) throws SQLException {
		String updateSql = "UPDATE Users set title = ?, description = ?, categoryId = ?, status = ?, deadline =? where todoId = ?";

		PreparedStatement preStat;
		try {
			preStat = todoConnect.prepareStatement(updateSql);

			preStat.setString(1, todolist.getTitle());
			preStat.setString(2, todolist.getDescription());
			preStat.setInt(3, todolist.getCategoryId());
			preStat.setString(4, todolist.getStatus());
			preStat.setString(5, todolist.getDeadline());

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(TodoList todolist) {
		try {
			
			Statement stat = (Statement) todoConnect.createStatement();

			int i = stat.executeUpdate("DELETE FROM todolist WHERE todoid =" + todoid);

			if (i == 1) {
				System.out.println("Deleting is Done.");

			}
			todoConnect.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return false;

	}

	@Override
	public List<TodoList> getAll() {
		List<TodoList> ListTask = new ArrayList<>();
		try {
			String sql = "SELECT *  FROM todolist";
			java.sql.Statement stmt = todoConnect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				TodoList todolist = new TodoList(rs.getString("title"), rs.getString("description"),
						rs.getInt("categoryId"), rs.getString("status"), rs.getString("deadline"));
				ListTask.add(todolist);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ListTask;

	}

}
