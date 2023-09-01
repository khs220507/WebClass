<%@page import="prj0831.Bucket"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>bucket list</h2>
<%
ArrayList<Bucket> list = (ArrayList<Bucket>)request.getAttribute("list");
for(Bucket item : list){
	out.println(item.getObject() + " ");
	out.println(item.getYear() + " ");
	out.println(item.getImportance() + "<br>");
}
%>


</body>
</html>