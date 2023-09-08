package elprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl1")
public class JSTL1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] books = {"부의 인문학", "C언어", "삼국지"};
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl1.jsp").forward(req, resp);
	
	}

}
