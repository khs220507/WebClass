package prj0828;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 사용자(클라이언트) 정보 추출
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		// 비즈니스 로직
		boolean result = true;
		
		// 응답 정상적인 로그인, 아이디, 비밀번호가 잘못된 경우
		
		if(result) { // 정상적인 아이디, 비밀번호
			out.println(userid + "님 로그인 성공했습니다.");
		} else {
			out.println("아이디/비밀번호를 확인하세요.");
		}
	}

}
