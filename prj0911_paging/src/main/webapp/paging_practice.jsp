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

int totRecords = 300;
int pageSize = 25;
int grpSize = 10;

int totalPage = 0;
int totalGrp = 0;

int currentGrp = 0;
int currentPage = 1;

int grpStartPage = 0;
int grpEndPage = 0;

// 총 페이지수 구하기

int remain = totRecords % pageSize;

if(remain == 0 ){
	totalPage = totRecords / pageSize;
} else {
	totalPage = totalPage / pageSize + 1;
}

// 현재 그룹 구하기
// 현재 그룹의 시작번호
// 현재 그룹의 끝번호
int remain2 = currentPage % grpSize;

if(remain2 == 0){
	currentGrp = currentPage / grpSize;
} else {
	currentGrp = currentPage / grpSize + 1;
}

grpStartPage = (currentGrp - 1) * grpSize +1;
grpEndPage = currentGrp * grpSize;

if(grpEndPage > totalPage){
	grpEndPage = totalPage;
}

int index = grpStartPage;
if(currentGrp>1){
	out.println("[이전]");
}

while(index<=grpEndPage){
	%>
	[<%=index%>]
	<%
	index++;
}
if(grpEndPage < totalPage){
	out.println("[다음]");
}
%>



</body>
</html>