package task.implementation;

import java.sql.SQLException;
import java.util.List;

import task.dao.TaskDao;
import task.model.Task;

public class TaskImplementation implements TaskDao{

	@Override
	public void addNewTask(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Task> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTask(Task task) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTask(int todoId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
