package prj0901_Training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/item")
public class CoffeeServletOne extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	CoffeeService s = new CoffeeService();
	Coffee c = s.getCoffeeOne(id);
	
	request.setAttribute("coffee", c);
	request.getRequestDispatcher("WEB-INF/views/coffeeOne.jsp").forward(request, response);
	}

}
