package com.todoList.Implentation;

import java.sql.*;

import com.todoList.DAO.UserDao;
import com.todoList.Model.User;

public class UserImplementation implements UserDao {

	@Override
	public boolean create(User user) throws SQLException {
		
		
		
		String jdbcURL = "jdbc:postgresql://localhost:5432/TodoList";
		String DbUsername = "postgres";
		String DbPassword = "MustaphaihouM@2609";
		String databaseDriver = "org.postgresql.Driver";
		
		

//		String first_name = request.getParameter("first_name");
//		String last_name = request.getParameter("last_name");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");

		

		try {
			Class.forName(databaseDriver);
			Connection connection = DriverManager.getConnection(jdbcURL, DbUsername, DbPassword);

			PreparedStatement preparedStatement = connection.prepareStatement(
					"INSERT INTO users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)");
			//
//			preparedStatement.setString(1, first_name);
//			preparedStatement.setString(2, last_name);
//			preparedStatement.setString(3, username);
//			preparedStatement.setString(4, password);
			
			preparedStatement.setString(1, user.getFirst_name());
			preparedStatement.setString(2, user.getFirst_name());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());

			int result = preparedStatement.executeUpdate();

			if (result > 0) {
				
				System.out.println("test");

//				request.getRequestDispatcher("view/login.jsp").forward(request, response);

			} else {
				
				System.out.println("ealou");

//				request.getRequestDispatcher("/view/signup.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)");
//
//		preparedStatement.setString(1, user.getFirst_name());
//		preparedStatement.setString(2, user.getLast_name());
//		preparedStatement.setString(3, user.getUsername());
//		preparedStatement.setString(4, user.getPassword());
//
//		int result = preparedStatement.executeUpdate();
//
//		if (result == 1) {
//			System.out.println("test");
//		}
//		System.out.println("ealou");
//		
//		connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		return false;

	}

}
