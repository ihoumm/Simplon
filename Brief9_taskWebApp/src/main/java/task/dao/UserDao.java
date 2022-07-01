package task.dao;

import java.sql.Connection;
import java.sql.SQLException;

import task.databaseConnection.TaskDatabaseConnection;
import task.model.User;


public interface UserDao {
	
	Connection connection = TaskDatabaseConnection.taskConnect();
	
    public boolean create(User user) throws SQLException;
}
