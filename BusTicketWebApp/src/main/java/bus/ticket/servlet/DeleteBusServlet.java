package bus.ticket.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bus.ticket.db.BusDBUtil;

@WebServlet("/DeleteBus")
public class DeleteBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("busid");
		boolean isTrue;
		
		isTrue = BusDBUtil.deleteBus(id);
		
		if(isTrue == true) {
			response.sendRedirect(request.getContextPath() + "/BusRegister");
		}
		else {
			response.sendRedirect(request.getContextPath() + "/BusProfile");

		}

}
}