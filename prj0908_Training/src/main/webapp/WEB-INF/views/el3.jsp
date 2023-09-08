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
	<c:set var="kor" value="30"/>
	<c:choose>
	<c:when test="${kor>=90}">A</c:when>
	<c:when test="${kor>=80}">B</c:when>
	<c:when test="${kor>=70}">C</c:when>
	<c:when test="${kor>=60}">D</c:when>
	<c:otherwise>F</c:otherwise>
	</c:choose>


</body>
</html>