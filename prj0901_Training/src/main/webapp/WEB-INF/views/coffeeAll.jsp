<%@page import="prj0901_Training.Coffee"%>
<%@page import="java.awt.geom.CubicCurve2D"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>모든 커피 메뉴</h2>
<% ArrayList<Coffee> list = (ArrayList<Coffee>)request.getAttribute("list"); %>
<% for(int i=0; i<list.size(); i++){
	out.println("CODE : " + list.get(i).getId() + " NAME : " + list.get(i).getName() +  " PRICE : " + list.get(i).getPrice() + "<br>");}%>
</body>
</html>