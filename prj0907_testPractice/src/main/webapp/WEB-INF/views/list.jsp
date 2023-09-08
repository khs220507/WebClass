<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="prj0907_testPractice.Member"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
	for(Member member : list){
		out.println(member.toString() + "<br>");
	}
	%>
</body>
</html>