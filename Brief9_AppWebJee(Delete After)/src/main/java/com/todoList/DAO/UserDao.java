package com.todoList.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import com.todoList.Model.User;
import com.todoList.connection.TodoListConnection;


public interface UserDao {
	
//	Connection connection = TodoListConnection.todoConnect();
	
    public boolean create(User user) throws SQLException;
}
