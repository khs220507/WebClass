package trining;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el7")
public class EL7 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Coffee> coffees = new ArrayList<>();
		coffees.add(new Coffee("b001", "아메리카노", 15000));
		coffees.add(new Coffee("b002", "카페라떼", 13000));
		coffees.add(new Coffee("b003", "헤이즐넛", 12000));
		
		req.setAttribute("coffees", coffees);
		req.getRequestDispatcher("WEB-INF/views/el7.jsp").forward(req, resp);
	}
}
