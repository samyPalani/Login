package bus.ticket.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import bus.ticket.db.BusDBUtil;
import bus.ticket.model.Bus;

@WebServlet("/BusProfile")
public class BusProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
				showBusDetails(request, response);
		

	}

	private void showBusDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String bus_id = String.valueOf(session.getAttribute("busID"));

		Bus b = BusDBUtil.getBusDetails(bus_id);
		System.out.println("Bus No >> " + b.getBusNo());
		System.out.println("No Of Seats >> " + b.getNoOfSeats());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/Profile.jsp");
		request.setAttribute("busDetails", b);

		dispatcher.forward(request, response);
	}
}