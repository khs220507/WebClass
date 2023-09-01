package prj0901_Training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class CoffeeServletUpdate extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	int newprice = Integer.parseInt(request.getParameter("newprice"));
	CoffeeService s = new CoffeeService();
	Coffee c = new Coffee(id, newprice);
	s.updateCoffee(c);
	request.getRequestDispatcher("WEB-INF/views/coffeeUpdate.jsp").forward(request, response);
	}
}
