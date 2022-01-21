package bus.ticket.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import bus.ticket.db.BusDBUtil;
import bus.ticket.model.Bus;


@WebServlet(urlPatterns = { "/BusRegister", "/UpdateBus" })
public class BusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/BusRegister":
				registerNewBust(request, response);
				break;
			case "/UpdateBus":
				updateBusDetails(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/BusRegister":
				showRegisterForm(request, response);
				break;
			case "/UpdateBus":
				showBusDetails(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void showRegisterForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/Bus.jsp");
		dispatcher.forward(request, response);

	}

	private void showBusDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String bus_id = String.valueOf(session.getAttribute("busID"));

		Bus b = BusDBUtil.getBusDetails(bus_id);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/UpdateBus.jsp");
		request.setAttribute("busDetails", b);

		dispatcher.forward(request, response);
	}

	private void updateBusDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("busid");
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String BNo = request.getParameter("BNo");
		String BType = request.getParameter("BType");
		String seats = request.getParameter("seats");
		String Password = request.getParameter("password");

		boolean isTrue;

		isTrue = BusDBUtil.updateBus(id, name, contact, email, BNo, BType, seats, Password);

		if (isTrue == true) {

			response.sendRedirect(request.getContextPath() + "/BusProfile");

		} else {
			response.sendRedirect(request.getContextPath() + "/UpdateBus");

		}

	}

	private void registerNewBust(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ownerName = request.getParameter("owner");
		String contactNo = request.getParameter("contact");
		String ownerEmail = request.getParameter("email");
		String BusNo = request.getParameter("BNo");
		String BType = request.getParameter("type");
		String NoOfSeats = request.getParameter("seats");
		String password = request.getParameter("pwd");

		boolean isTrue;

		isTrue = BusDBUtil.insertdetails(ownerName, contactNo, ownerEmail, BusNo, BType, NoOfSeats, password);

		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/view/Yes.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis1 = request.getRequestDispatcher("WEB-INF/view/No.jsp");
			dis1.forward(request, response);
		}

	}

}