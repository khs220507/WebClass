package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import oracle.sql.json.OracleJsonObject;



@WebServlet("/food5")
public class FoodServlet5 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// JSON 관련 라이브러리
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		FoodService service = new FoodService();
		JSONArray arr = service.getFoodRealList();
		resp.getWriter().println(arr);
		
	}
}
