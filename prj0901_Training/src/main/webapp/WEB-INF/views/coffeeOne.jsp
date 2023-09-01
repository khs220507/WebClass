<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "prj0901_Training.Coffee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>내가 원하는 커피</h2>

<% Coffee c = (Coffee)request.getAttribute("coffee"); %>

ID : <%=c.getId()%><br>
NAME : <%=c.getName()%><br>
PRICE : <%=c.getPrice()%><br>

</body>
</html>