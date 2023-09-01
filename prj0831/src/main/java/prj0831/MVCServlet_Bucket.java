package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BucketList")
public class MVCServlet_Bucket extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceMVC_Bucket b = new ServiceMVC_Bucket();
		ArrayList<Bucket> list = b.getlist();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/bucketlist.jsp").forward(request, response);
	}
	
	

}
