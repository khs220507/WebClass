<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> hello world</h1>

<!-- 스크립트릿 -->
<%
String name = request.getParameter("name");
if(name==null){
	out.print("Guest Hello~");
} else{
out.print(name + " hello~");
}
%>

<!-- 표현식 -->
<%=name%>

</body>
</html>