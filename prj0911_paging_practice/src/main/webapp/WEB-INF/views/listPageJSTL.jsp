<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>아이디</td>
<td>비밀번호</td>
<td>이름</td>

</tr>

 
 <c:set var="path"  value="<%=request.getContextPath() %>"/>
 
 <c:forEach  var="item" items="${list}">
	 <tr>
	<td>${item.id}</td>
	<td>${item.pw}</td>
	<td>${item.name}</td>
	
	</tr>
 </c:forEach> 
 
 </table>
 
 <c:set var="index" value="${handler.grpStartPage}"/>
 
 <c:if test="${handler.currentGrp > 1}">
    <a href="/prj0911_paging_practice/list.page?p=${index - 1}">[ 이전 ]</a>
</c:if>

<c:forEach begin="${index}" end="${handler.grpEndPage}" var="i"> 
    <a href="/prj0911_paging_practice/list.page?p=${i}">[ ${i} ]</a>  
</c:forEach>

<c:if test="${handler.grpEndPage <  handler.totalPage}">
    <a href="/prj0911_paging_practice/list.page?p=${paging.grpEndPage+1}">[ 다음 ]</a>
</c:if>


</body>
</html>