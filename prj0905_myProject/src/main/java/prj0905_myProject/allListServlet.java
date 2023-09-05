package prj0905_myProject;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/allList")
public class allListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TheaterService s = new TheaterService();
		ArrayList<ReservationInfo> list = s.getAllList();
		System.out.println(list);
		//모델심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/allList.jsp").forward(req, resp);
	}
}
