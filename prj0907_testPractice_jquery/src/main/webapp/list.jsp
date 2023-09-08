<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="source.Member" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<Script>
function send(){
	$.ajax({
		type:"get",
		dataType:"json",
		url:"/prj0907_testPractice_jquery/all",
		success:funtion(data){
			console.log(data)
			$("#result").html(data);
		},
		error:funtion(err){
			alert("요청에 실패했습니다.")
		}
		
	});
}
</Script>
<title>Insert title here</title>
<button onclick="send()">회원 정보</button>
<div id ="result"></div>
</head>
<body>


</body>
</html>