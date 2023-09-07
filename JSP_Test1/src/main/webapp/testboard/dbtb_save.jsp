<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="java.sql.*,java.util.*" %>

<!-- 클라이언트에서 넘어오는 한글이 깨어지지 않게 처리 -->

<% request.setCharacterEncoding("UTF-8");  %>

    
<%
	String na = request.getParameter("name");
	String pw = request.getParameter("password");
	String mail = request.getParameter("email");
	String addr = request.getParameter("address");
	String sub = request.getParameter("subject");
	String cont = request.getParameter("content");
	String ymd = (new java.util.Date()).toLocaleString();		//현재 시스템의 날짜를 생성해서 String 로 변환

%>
  <!-- 오라클 DB연결  -->
    
    <%@ include file = "../DB_Connection/db_conn_oracle.jsp"%>
    
 <%
 
 	String sql = null;
 	Statement stmt = null;
 	
	stmt = conn.createStatement();	

 	sql="insert into testboard(tname,tpass,temail,taddr,today,sub,content) ";
 	sql=sql+"values('" + na +"','" + pw +"','" + mail +"','" + addr +"','" + ymd +"','" + sub +"','" + cont +"')";

	try{
	//stmt 객체에 sql 쿼리를 넣어서 DB에 저장
	stmt.executeUpdate(sql);	//insert , update, delete 쿼리일때 사용, 톰캣 기본 설정은 commit이 작동됨
		//DB 연결에 문제가 생길시 오류 발생 : try catch 로 묶어 주어야 한다.
	}catch(Exception e){
		e.printStackTrace(); 
		out.println("DB연결에 문제가 발생했습니다. 고객센터로 연락 바랍니다. 010-111-1111");
		
	}finally{
		conn.close();
		stmt.close();
	}
	
%>

<!-- 클라이언트의 값을 DB에 저장후 페이지 이동 -->
<jsp:forward page = "dbtb_show.jsp" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% out.println(sql); %>
	
	<h3>클라이언트에서 넘어오는 변수를 받아서 출력</h3>
	<div><%=na %></div>
	<div><%=pw %></div>
	<div><%=mail %></div>
	<div><%=addr %></div>
	<div><%=sub %></div>
	<div><%=cont %></div>
	<div><%=ymd %></div>

	<hr>
		<h3> 출력 out.println</h3>
	<%
		out.println("<div>na 변수의 값" + na + "</div>");
		out.println("<div>em 변수의 값" + pw + "</div>");
		out.println("<div>em 변수의 값" + mail + "</div>");
		out.println("<div>em 변수의 값" + addr + "</div>");
		out.println("<div>sub 변수의 값" + sub + "</div>");
		out.println("<div>cont 변수의 값" + cont + "</div>");
		out.println("<div>ymd 변수의 값" + ymd + "</div>");
	%>

</body>
</html>