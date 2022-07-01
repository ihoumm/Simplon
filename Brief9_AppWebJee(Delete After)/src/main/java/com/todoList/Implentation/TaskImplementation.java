package com.todoList.Implentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.todoList.DAO.TaskDao;
import com.todoList.Model.Task;
import com.todoList.connection.TodoListConnection;

public class TaskImplementation  implements TaskDao{

//	Connection connection = TodoListConnection.todoConnect();
	
	
	

	private static final String INSERT_TasksS = "INSERT INTO todolist" + "  (title, description, categoryid, status, deadline) VALUES " + " (?, ?, ?, ?, ?);";
	private static final String SELECT_ALL_TaskS = "select * from todolist";
	private static final String UPDATE_TaskS = "update todolist set title = ?, description= ?, categoryid =? , status =? , deadline =? where todoId = ?;";
	private static final String DELETE_TaskS = "delete from todolist where todoid = ?;";
	
	
	
	@Override
	public void addNewTask(Task task) {
		
//		System.out.println(INSERT_TasksS);
//		// try-with-resource statement will auto close the connection.
//		try (Connection connection = TodoListConnection.todoConnect();
//				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TasksS)) {
//			preparedStatement.setString(1, task.getTitle());
//			preparedStatement.setString(2, task.getDescription());
//			preparedStatement.setString(3, task.getCategoryId());
//			preparedStatement.setString(4, task.getStatus());
//			preparedStatement.setString(5, task.getDeadline());
//
//			System.out.println(preparedStatement);
//			preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
	

	@Override
	public List<Task> listAll() {
		return null;
		// using try-with-resources to avoid closing resources (boiler plate code)
//				List<Task> task = new ArrayList<>();
//				// Step 1: Establishing a Connection
//				try (Connection connection = TodoListConnection.todoConnect();
//
//						// Step 2:Create a statement using connection object
//					PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TaskS);) {
//					
//					System.out.println(preparedStatement);
//					// Step 3: Execute the query or update query
//					ResultSet resultSet = preparedStatement.executeQuery();
//
//					// Step 4: Process the ResultSet object.
//					while (resultSet.next()) {
//						int todoId = resultSet.getInt("todoId");
//						String title = resultSet.getString("title");
//						String description = resultSet.getString("description");
//						String categoryId = resultSet.getString("categoryId");
//						String status = resultSet.getString("status");
//						String deadline = resultSet.getString("deadline");
//						task.add(new Task(todoId, title, description, categoryId, status, deadline));
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//				return task;
	}

	@Override
	public boolean updateTask(Task task) throws SQLException {
		return false;
//		boolean rowUpdated;
//		try (Connection connection = TodoListConnection.todoConnect();
//				PreparedStatement statement = connection.prepareStatement(UPDATE_TaskS);) {
//			statement.setString(1, task.getTitle());
//			statement.setString(2, task.getDescription());
//			statement.setString(3, task.getCategoryId());
//			statement.setString(4, task.getStatus());
//			statement.setString(5, task.getDeadline());
//			statement.setInt(5, task.getTodoId());
//
//			rowUpdated = statement.executeUpdate() > 0;
//			
//		}
//		return rowUpdated;
	}

	@Override
	public boolean deleteTask(int todoId) throws SQLException {
		return false;
//		boolean rowDeleted;
//		try (Connection connection = TodoListConnection.todoConnect();
//				PreparedStatement statement = connection.prepareStatement(DELETE_TaskS);) {
//			statement.setInt(1, todoId);
//			rowDeleted = statement.executeUpdate() > 0;
//		}
//		return rowDeleted;
	
	}


	
}
