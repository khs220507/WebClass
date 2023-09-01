package prj0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc1")
public class MVCServlet1 extends HttpServlet {

	// m : model : pojo 자바로 작성 (service, dao)
	// v : view : jsp 응답할 view 작성 (html, css, javascript)
	// c : servlet : 요청, 응답까지의 흐름을 제어
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Model, 데이터
		String message = "화이팅!";
		
		// request를 저장소로 사용함 (MVC)
		// request 저장소에 model 심기
		request.setAttribute("msg", message); // 키, 값
		request.getRequestDispatcher("WEB-INF/views/mvc1.jsp").forward(request, response);
	}

}
