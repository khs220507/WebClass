package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04")
public class Ex04 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); 
		response.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();
		String num1_ = request.getParameter("num1");
		String num2_ = request.getParameter("num2");
		int num1 = Integer.parseInt(num1_);
		int num2 = Integer.parseInt(num2_);
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		out.print(sum);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title >");
		out.println("</head>");
		out.println("합 : " + sum);
		out.println("차 : " + sub);
		out.println("곱 : " + mul);
		out.println("몫 : " + div);

		out.println("</body>");
		out.println("<html>");
	}
}
