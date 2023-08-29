<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@  page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%

request.setCharacterEncoding("UTF-8");
String regno = request.getParameter("regno");
String regtime = request.getParameter("regtime");
String regdate = request.getParameter("regdate");
String id = request.getParameter("id");
String startpoint = request.getParameter("startpoint");
String destination = request.getParameter("destination");
String taxino = request.getParameter("taxino");
String state = request.getParameter("state");

System.out.println(regno);
System.out.println(regtime);
System.out.println(regdate);
System.out.println(id);
System.out.println(startpoint);
System.out.println(destination);
System.out.println(taxino);
System.out.println(state);

Connection con=null;
PreparedStatement st = null;

try{ 
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	 //1. 오라클드라이버 로딩
	Class.forName(driver); //2. 데이터베이스 연결
	con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
	
	if(con!=null){
		System.out.println("DB OK!");
	}
	
	String sql ="insert into tblcall_list values(?,?,?,?,?,?,?,?)"; //5. 최종적으로 실행
	System.out.println(sql);

	st = con.prepareStatement(sql);
	
	
	st.setString(1, regno);
	st.setString(2, regtime);
	st.setString(3, regdate);
	st.setString(4, id);
	st.setString(5, startpoint);
	st.setString(6, destination);
	st.setString(7, taxino);
	st.setString(8, state);
	
	
	 //4. 필요한 sql 작성
	st.executeUpdate();

}catch(Exception e){
	e.printStackTrace();
}
finally{ //자원의 반납
	
	if( st != null) st.close();
	if( con != null) con.close();
}

%>



</body>
</html>