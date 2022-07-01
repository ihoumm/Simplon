package task.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import task.databaseConnection.TaskDatabaseConnection;
import task.implementation.UserImplementation;
import task.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet(urlPatterns = "/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignUpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

//		request.getRequestDispatcher("/view/signup.jsp");

//
//		User newUser = new User("najibo", "rachidy", "nkin", "tassarot");
//
//		UserImplementation userImplementation = new UserImplementation();
//		try {
//			userImplementation.create(newUser);
//		} catch (SQLException e) {
//			System.out.println("msahakill!");
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//		}

		// request.getRequestDispatcher("/view/signup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection connection = TaskDatabaseConnection.taskConnect();

		UserImplementation userImplementation = new UserImplementation();

		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User newUser = new User(first_name, last_name, username, password);

		try {

			userImplementation.create(newUser);

			newUser.setFirst_name(first_name);
			newUser.setLast_name(last_name);
			newUser.setUsername(username);
			newUser.setPassword(password);

			try {
				boolean result = userImplementation.create(newUser);
				if (result == true) {
					response.sendRedirect("/view/login.jsp");
					System.out.println("verify");
				} else {
					response.sendRedirect("/view/signup.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();

			}

//			response.sendRedirect("/view/login.jsp");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
