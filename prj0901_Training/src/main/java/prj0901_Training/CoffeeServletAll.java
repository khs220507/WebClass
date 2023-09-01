package prj0901_Training;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CoffeList")
public class CoffeeServletAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CoffeeService s = new CoffeeService();
		ArrayList<Coffee> list = s.getCoffeeListAll();
		System.out.println(list);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/coffeeAll.jsp").forward(request, response);
	}
}
