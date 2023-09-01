package prj0901_Training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class CoffeeServletRegister extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String id = request.getParameter("id");
	String name = request.getParameter("name");
	int price = Integer.parseInt(request.getParameter("price"));
	
	CoffeeService s = new CoffeeService();
	s.registerCoffee(new Coffee(id, name, price));
	request.getRequestDispatcher("WEB-INF/views/coffeeRegister.jsp").forward(request, response);
	}
}
