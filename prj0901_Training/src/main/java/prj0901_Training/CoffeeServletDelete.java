package prj0901_Training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class CoffeeServletDelete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		CoffeeService s = new CoffeeService();
		s.deleteCoffee(id);
		request.getRequestDispatcher("WEB-INF/views/coffeeDelete.jsp").forward(request, response);
	}
}
