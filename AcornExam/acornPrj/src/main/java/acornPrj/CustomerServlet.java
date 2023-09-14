package acornPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/all")
public class CustomerServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		AcornService s = new AcornService();
		ArrayList<Acorn> list = s.getAllList();
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/list.jsp").forward(req, resp);
		
	}
}
