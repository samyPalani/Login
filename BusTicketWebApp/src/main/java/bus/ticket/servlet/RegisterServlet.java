package bus.ticket.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import bus.ticket.db.CustomerDBUtil;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirm = request.getParameter("confirm");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertcustomer(fullname, email, phone, username, password);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/view/Account.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis1 = request.getRequestDispatcher("WEB-INF/view/Retry.jsp");
			dis1.forward(request, response);
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			showRegisterForm(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void showRegisterForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/Register.jsp");
		dispatcher.forward(request, response);

	}
}
