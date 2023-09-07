<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	String sessionId=(String)session.getAttribute("id");
	String sessionRole=(String)session.getAttribute("role");
	

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품등록</title>
<style>
	div {
		width : 700px;
		margin: 0 auto ; 
	}
	td {
		padding: 10px; 
	}

</style>
</head>
<body>
	<center>
		<h1> 제품 등록 페이지 (관리자만 접근가능.)</h1>
		<hr> 
		<% 
		
			if (sessionRole != null && sessionRole.equals("Admin")){
		%>

		
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertProducts.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
				<td bgcolor="green" width="70">코드</td>
				<td align="left"><input type="text" name="p_code"></td>
				</tr>
				<tr>
				<td bgcolor="green" width="70">이름</td>
				<td align="left"><input type="text" name="p_name" size="10"></td>
				</tr>
				<tr>
				<td bgcolor="green" width="70">종류</td>
				<td align="left"><input type="text" name="p_kind"></td>
				</tr>
				<tr>
				<td bgcolor="green" width="70">가격</td>
				<td align="left"><input type="text" name="p_price"></td>
				</tr>
				<tr>
				<td bgcolor="green" width="70">상세 정보</td>
				<td align="left"><input type="text" name="p_content" cols="40" rows="10"></td>
				</tr>
				<tr>
				<td bgcolor="green" width="70">수량</td>
				<td align="left"><input type="text" name="p_quantity"></td>
				</tr>
			<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" 새 제품 등록 " /></td>
			</tr>
			</table>
		</form>
		
		<%
			}else{		//sessionId변수가 null 일떄 출력 부분
		%>
		
			당신은 로그인 되지 않는 상태입니다. 먼저 로그인후 글을 쓸 수 있습니다.
			<br><br>
			<a href="LoginForm.jsp">로그인 하기</a>
		
		<%
			}
		%>

	</center>
</body>
</html>