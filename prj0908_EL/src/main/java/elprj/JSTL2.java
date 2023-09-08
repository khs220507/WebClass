package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl2")
public class JSTL2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String[] books = {"부의 인문학", "C언어", "삼국지"};
		
		ArrayList<String> books = new ArrayList<>();
		books.add("고구려");
		books.add("삼국지");
		books.add("칼");
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl2.jsp").forward(req, resp);
	
	}

}
