package com.todoList.DAO;

import java.sql.SQLException;
import java.util.List;

import com.todoList.Model.Task;

public interface TaskDao {
	public void addNewTask(Task task);
	public List<Task> listAll();
	boolean updateTask(Task task) throws SQLException;
	boolean deleteTask(int todoId) throws SQLException;
}
