<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="acornPrj.Acorn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<header><h2>에이콘 학생리스트</h2></header>

<%
ArrayList<Acorn> list = (ArrayList<Acorn>)request.getAttribute("list");
for(Acorn i : list){%>
<table>
<tr>
<td><%out.print(i.getId());%></td>
<td><%out.print(i.getPw());%></td>
<td><%out.print(i.getName());%></td>
</tr>
<%}%>
</table>
</body>
</html>