package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hap")
public class Ex02 extends HttpServlet{
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// 키 이름으로 value 값을 얻어올 수 있다.
		String num1_ = request.getParameter("num1");
		String num2_ = request.getParameter("num2");
		int num1 = Integer.parseInt(num1_);
		int num2 = Integer.parseInt(num2_);
		int sum = num1 + num2;
		PrintWriter out = response.getWriter();
		out.print(sum);
	}

}
