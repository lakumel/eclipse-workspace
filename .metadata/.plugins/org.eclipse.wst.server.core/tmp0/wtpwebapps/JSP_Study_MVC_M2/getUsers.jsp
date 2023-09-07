<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.mysite.users.UsersDTO" %>
    
    <%
    
    //세션에 저장된 변수의 값을 불러옴
    UsersDTO users=(UsersDTO) session.getAttribute("users");
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세</title>

<style>

	div{
		width:700px;
		margin:0 auto;
		
	}
	td{
		padding:10px;
	}
	
</style>

</head>
<body>
	<div>
		<h1>상세 페이지 -form 태그 내부에 value 값에 출력(수정을 바로 할 수 있도록)</h1>
		<hr>
		<br>
		<br>
		
		<!-- 글 수정시 변수 값을 서버로 전송 -->
		<form action="updateUsers.do" method="post">
		
		<input type = "hidden" name = "id" value = "<%= users.getId() %>">
		<table border="1px" cellspacing="0" cellpadding="0">
		<tr>
			<td bgcolor="green">아이디</td>
			<td><%= users.getId() %></td>
		</tr>
		<tr>
			<td bgcolor="green">비밀번호</td>
			<td><%= users.getPassword() %></td>
		</tr>
<tr>
    <td bgcolor="green">이름</td>
    <td>
        <input type="text" name="name" 
        value="<%=users.getName() %>">
    </td>
<tr>
    <td bgcolor="green">접근자</td>
    <td>
        <input type="text" name="role" value=
        "<%=users.getRole()%>">
    </td>
</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="글 수정 하기"></td>
		</tr>
		</table>
		</form>
		<br><br>
		<a href="getUsersList.do">글 목록 보기</a>
		<br><br>
		<a href="insertUsers.jsp">글 쓰기</a>
		<br><br>
		<a href="deleteUsers.do?id=<%= users.getId() %>">글삭제</a>
	</div>
</body>
</html>