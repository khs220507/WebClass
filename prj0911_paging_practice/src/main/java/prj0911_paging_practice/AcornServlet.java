package prj0911_paging_practice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list.page")
public class AcornServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String p = req.getParameter("p");
		int currentPage = 1;
		if(p!=null) {
		currentPage = Integer.parseInt(p);
		}	
	
	AcornDAO dao = new AcornDAO();
	int totalRecords = dao.getTotalCnt();
	int pageSize=2;
	int grpSize=4;
	
	PageHandler handler = new PageHandler(currentPage, totalRecords, pageSize, grpSize);
	ArrayList<Acorn> list = dao.getListPage(currentPage, pageSize);
	
	req.setAttribute("list", list);
	req.setAttribute("handler", handler);
	req.getRequestDispatcher("WEB-INF/views/listPageJSTL.jsp").forward(req, resp);
}
}
