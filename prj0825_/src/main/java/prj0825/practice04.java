package prj0825;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice04")
public class practice04 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String num_ = request.getParameter("num");
		int num = Integer.parseInt(num_);
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");

		for (int i = 0; i < num; i++) {
			out.println("*");

		}

		out.println("</body>");
		out.println("<html>");

	}
}
