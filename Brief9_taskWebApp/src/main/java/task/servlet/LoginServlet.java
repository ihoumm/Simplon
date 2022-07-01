package task.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import task.databaseConnection.TaskDatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection = TaskDatabaseConnection.taskConnect();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// username, password
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (!username.equals("") && !password.equals("")) {
			


//			request.getRequestDispatcher("/view/login.jsp").forward(request, response);
			response.sendRedirect("/view/HomePage.jsp");
			
			
		} else {

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
	}


}
