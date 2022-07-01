package com.todoList.Servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.todoList.connection.TodoListConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// username, password
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {

			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from users where username = ? and password = ?");

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				
				request.getRequestDispatcher("view/HomePage.jsp").forward(request, response);
				
			} else {
				
				request.getRequestDispatcher("/view/login.jsp").forward(request, response);
			}
			
			connection.close();
			preparedStatement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
}
