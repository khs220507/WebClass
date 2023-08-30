<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.sql.*"%>


<%
String regno = request.getParameter("regno");
String regtime = "";
String regdate = "";
String cusno = "";
String startpoint = "";
String destination = "";
String taxino = "";
String state = "";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="./css/register_taxi.css" rel="stylesheet" />
<script>
	function check() {
		/*
		 let taxi_form = document.taxi_form;
		 let regno = taxi_form.regno;
		 let regtime = taxi_form.regtime;
		 let regdate = taxi_form.regdate;
		 let cusno = taxi_form.cusno;
		 let startpoint = taxi_form.startpoint;
		 let destination = taxi_form.destination;
		 let taxino = taxi_form.taxino;
		 let state = taxi_form.state;

		 if (regno.value == "") {
		 alert("예약번호를 입력하세요!");
		 regno.focus();
		 return false;
		 } else if (regtime.value == "") {
		 alert("예약시간을 입력하세요!");
		 regtime.focus;
		 return false;
		 } else if (regdate.value == "") {
		 alert("예약날짜를 입력하세요!");
		 regdate.focus;
		 return false;
		 } else if (cusno.value == "") {
		 alert("아이디를 입력하세요!");
		 cusno.focus;
		 return false;
		 } else if (startpoint.value == "") {
		 alert("시작지점을 입력하세요!");
		 startpoint.focus;
		 return false;
		 } else if (destination.value == "") {
		 alert("도착지점을 입력하세요!");
		 destination.focus;
		 return false;
		 } else if (taxino.value == "") {
		 alert("택시번호를 입력하세요!");
		 taxino.focus;
		 return false;
		 } else if (state.value == "선택하기") {
		 alert("배차상태를 선택하세요!");
		 state.focus;
		 return false;
		 }
		
		 */
		return true;
	}
</script>
</head>
<body>

	<%
	String userpw = "";
	String username = "";

	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";

		//1. 오라클드라이버 로딩
		Class.forName(driver); //2. 데이터베이스 연결
		con = DriverManager.getConnection(url, user, password); //3. statement 얻어오기

		String sql = "select REGNO, REGTIME, TO_CHAR(REGDATE,'YYYY-MM-DD'),CUSNO,STARTPOINT,DESTINATION,TAXINO,STATE from tblcall_list where regno = '"
		+ regno + "'"; //5. 최종적으로 실행

		st = con.createStatement();		
		rs = st.executeQuery(sql);

		if (rs.next()) {

			regtime = rs.getString(2);
			regdate = rs.getString(3);
			cusno = rs.getString(4);
			startpoint = rs.getString(5);
			destination = rs.getString(6);
			taxino = rs.getString(7);
			state = rs.getString(8);
			
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally { //자원의 반납
		if (rs != null)
			rs.close();
		if (st != null)
			st.close();
		if (con != null)
			con.close();
	}
	%>

	<form name="frm" action="update_action.jsp" method="post"
		onsubmit="return check()">
		<table>
			<caption>
				<strong>택시 예약 변경</strong>
			</caption>
			<tr>
				<td>예약번호</td>
				<td><input type="text" readonly="readonly" name="regno"></td>
			</tr>
			<tr>
				<td>예약시간</td>
				<td><input type="text" name="regtime"></td>
			</tr>
			<tr>
				<td>예약날짜</td>
				<td><input type="text" name="regdate"></td>
			</tr>
			<tr>
				<td>고객아이디</td>
				<td><input type="text" name="cusno"></td>
			</tr>
			<tr>
				<td>출발지</td>
				<td><input type="text" name="startpoint"></td>
			</tr>d
			<tr>
				<td>목적지</td>
				<td><input type="text" name="destination"></td>
			</tr>
			<tr>
				<td>택시번호</td>
				<td><input type="text" name="taxino"></td>
			</tr>
			<tr>
				<td>배차상태</td>
				<td><select name="state">
						<option value="선택하기">선택하기</option>
						<option value="P">배차완료</option>
						<option value="R">배차준비</option>
						<option value="X">배차미정</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2">
					<button>변경</button>
					<button>다시입력</button>
				</td>


			</tr>
		</table>
	</form>

	<script type="text/javascript">
	
let frm = document.frm;
frm.regno.value="<%=regno%>";

frm.regtime.value="<%=regtime%>";
frm.regdate.value="<%=regdate%>";
frm.cusno.value="<%=cusno%>";
frm.startpoint.value="<%=startpoint%>";
frm.destination.value="<%=destination%>";
frm.taxino.value="<%=taxino%>";
frm.state.value="<%=state%>";
	</script>
</body>
</html>