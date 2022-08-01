package Servlet;

import java.io.IOException;

import Dao.UserDao;
import Model.User;
@WebServlet("/Register")
public class UserController extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		register(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("Register/register.jsp");
	}

	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUsername(username);
		user.setPassword(password);
		request.setAttribute("firstName", firstName);

		try {
			int result = userDao.registerUser(user);
			if(result == 1) {
				request.setAttribute("NOTIFICATION", "User Registered Successfully!");
				response.sendRedirect("list");
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("Task/TaskList.jsp");
		dispatcher.forward(request, response);
	}
}
