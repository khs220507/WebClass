<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
String num1_ = request.getParameter("num1");
String num2_ = request.getParameter("num2");
int num1 = Integer.parseInt(num1_);
int num2 = Integer.parseInt(num2_);
int sum = num1 + num2;
int sub = num1 - num2;
int mul = num1 * num2;
int div = num1 / num2;
out.print(sum);
out.print(sub);
out.print(mul);
out.print(div);
%>

</body>
</html>