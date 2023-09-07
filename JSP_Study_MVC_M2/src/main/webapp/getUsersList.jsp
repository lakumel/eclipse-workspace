<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.util.*" %>
    <%@ page import = "com.mysite.users.UsersDTO" %>
    
    <% 
    //새션에 저장된 값을 끄집어 낸다.
    List<UsersDTO>usersList=new ArrayList<UsersDTO>();
    
    usersList=(List)session.getAttribute("usersList");
    
    		%>
    		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자</title>
<style>

	div{
	width:750px;
	margin:0 auto;
	}
	
</style>
</head>
<body>

	<div>
	<h1>사용자</h1>
	
	<table border="1px" cellpadding="0" cellspacing="0" width="700px">
	<tr>
	<th bgcolor="green" width="100px">아이디</th>
	<th bgcolor="green" width="100px">비밀번호</th>
	<th bgcolor="green" width="100px">이름</th>
	<th bgcolor="green" width="100px">접근자</th>
	
	</tr>
	
	<!--db에 값을 가져와서 루프 시작  -->
	
	<%
		for(UsersDTO k : usersList){
			
	

	%>

	<tr>
		<td><%= k.getId() %></td>
		<td><%= k.getPassword() %></td>
		<td>
		<a href="getUsers.do?id=<%=k.getId() %>">
		<%= k.getName() %>
		</a>
		</td>
		<td><%= k.getRole() %></td>
	</tr>

			<!--  루프 끝  -->
			<%
				}
			
			//session 객체의 저장된 변수 제거  : 모두 사용후 
			session.removeAttribute("usersList"); 
			
			%>
	</table>
	
	<br><br>
	<a href="insertUsers.jsp">등록</a>
	
	</div>

</body>
</html>