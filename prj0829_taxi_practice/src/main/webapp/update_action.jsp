<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.sql.*"%>

<%
request.setCharacterEncoding("UTF-8");

String regno = request.getParameter("regno");
String regtime = request.getParameter("regtime");
String regdate = request.getParameter("regdate");
String cusno = request.getParameter("cusno");
String startpoint = request.getParameter("startpoint");
String destination = request.getParameter("destination");
String taxino = request.getParameter("taxino");
String state = request.getParameter("state");

out.println(regno);
out.println(state);

Connection con=null;
PreparedStatement st = null;

try{ 
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	 
	Class.forName(driver); 
	con= DriverManager.getConnection(url, user, password); 
	String sql = "update tblcall_list set regtime=?, regdate=?, cusno=?, startpoint=?, destination=?, taxino=?, state=? where regno=?";
			
	
			System.out.println(sql);
	st = con.prepareStatement(sql); 
	
	
	st.setString(1, regtime);
	st.setString(2, regdate);
	st.setString(3, cusno);
	st.setString(4, startpoint);
	st.setString(5, destination);
	st.setString(6, taxino);
	st.setString(7, state);
	st.setString(8, regno);
	st.executeUpdate();
	
	 
	
}catch(Exception e){
	e.printStackTrace();
}
finally{ //자원의 반납
	
	if( st != null) st.close();
	if( con != null) con.close();
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update_action</title>
</head>
<body>

</body>
</html>