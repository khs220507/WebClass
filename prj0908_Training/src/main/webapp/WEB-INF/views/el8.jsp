<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String id = (String)session.getAttribute("id");
%>

<c:if test="${id eq 'khs220507'}">
<h2>로그인중입니다.</h2>
</c:if>

<c:if test="${id ne 'khs220507'}">
<h2>아이디를 확인해 주세요.</h2>
</c:if>

 <c:set var="loginout" value="${empty id ? 'login':'logout'}"/>
 ${loginout}
 
 <c:set var="test" value="khs"/>
 <c:set var="result" value="${empty test ? 'test가 없다' : 'test가 있다'}"/>
${result}


</body>
</html>