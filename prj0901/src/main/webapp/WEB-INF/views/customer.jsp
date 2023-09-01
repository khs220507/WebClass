<%@page import="prj0901.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "prj0901.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 고객 정보 조회 </h2>

<% Customer c = (Customer)request.getAttribute("customer");%>


아이디 : <%=c.getId()%><br>
비밀번호 : <%=c.getPw()%><br>
이름 : <%=c.getName()%><br>


</body>
</html>