package task.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import task.databaseConnection.TaskDatabaseConnection;
import task.model.Task;


public interface TaskDao {
	
	Connection connection = TaskDatabaseConnection.taskConnect();
	
	public void addNewTask(Task task);
	public List<Task> listAll();
	boolean updateTask(Task task) throws SQLException;
	boolean deleteTask(int todoId) throws SQLException;
}
