package bus.ticket.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bus.ticket.db.BusDBUtil;

@WebServlet("/UpdateBusServlet" )
public class UpdateBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String id=request.getParameter("busid");
		String name=request.getParameter("name");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String BNo=request.getParameter("BNo");
		String BType=request.getParameter("BType");
		String seats=request.getParameter("Seats");
		String Password=request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = BusDBUtil.updateBus(id, name, contact, email, BNo, BType, seats, Password);
		
		if(isTrue == true) {
			
//			List<Bus> cusDetails = BusDBUtil.getBusDetails(id);
			request.setAttribute("cusDetails","cusDetails");
			
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/view/Profile.jsp");
			dis.forward(request, response);
		}
		else {
//			List<Bus> cusDetails = BusDBUtil.getBusDetails(id);
			request.setAttribute("cusDetails","cusDetails");
			
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/view/Profile.jsp");
			dis.forward(request, response);
		}
	} 

}