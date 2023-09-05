<%@page import="prj0905_myProject.ReservationInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="prj0905_myProject.ReservationInfo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>예매 현황 리스트</h2>
	<%
	ArrayList<ReservationInfo> list = (ArrayList<ReservationInfo>)request.getAttribute("list");
	%>
	<%
	for (int i = 0; i < list.size(); i++) {
		out.println(list.get(i).getR_num());
		out.println(list.get(i).getId());
		out.println(list.get(i).getPw());
		out.println(list.get(i).getM_title());
		out.println(list.get(i).getM_start_end() + "<br>");
	}
	%>

</body>
</html>