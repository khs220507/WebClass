<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>첫 페이지</h2>
<% String id = (String)session.getAttribute("id");
if(id==null){
%>
<a href="/login">로그인</a>
<%} else { %>
<a href="/logout">로그아웃</a>
<a href="/order">예약하기</a>
<%} %>

</body>
</html>