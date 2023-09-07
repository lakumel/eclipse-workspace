<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "com.mysite.products.ProductsDTO" %>
    
    <%
    
    //세션에 저장된 변수의 값을 불러옴
    ProductsDTO products=(ProductsDTO)session.getAttribute("products");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<h1>글 상세 페이지 - Form 태그 내부에 value 값에 출력(수정을 바로 할 수 있도록)</h1>
	<hr>
	<br><br>

		<form action="updateProducts.do" method="post">
		<!--글 수정시 변수 값을 서버로 전송  -->
		
		<input type="hidden" name="p_code" value="<%=products.getP_code() %>">
		<table border="1px" cellspacing="0" cellpadding="0">
		<tr>
		<td>코드</td>
		<td><inptu type="text" name="P_code" value="<%=products.getP_code() %>">
		</td>
		</tr>
		<tr>
		<td>이름</td>
		<td><input type="text" name = "p_name" value="<%=products.getP_name() %>">
		</td>
		</tr>
		<tr>
		<td>종류</td>
		<td><input type="text" name="p_kind" value="<%=products.getP_kind() %>">
		</td>
		</tr>
		<tr>
		<td>가격</td>
		<td><input type="text" name="p_price" value="<%=products.getP_price() %>">
		</td>
		</tr>
		<tr>
		<td>상세정보</td>
		<td><input type="text" name="P_content" value="<%=products.getP_content() %>">
		</td>
		</tr>
		<tr>
		<td>수량</td>
		<td><input type="text" name="P_quantity" value="<%=products.getP_quantity() %>">
		</td>
		</tr>
		<tr>
		<td>등록일</td>
		<td><%=products.getIndate() %>
		</td>
		</tr>
		<tr>
		<td colspan = "2" align ="center"> 
		<input type="submit" value = " 글 수정 하기"> 
		</td> 
		</tr>
	
	</table>
	</form>
		<br><br>
		<a href="getProductsList.do">글 목록 보기</a>
		<br><br>
		<a href="insertProducts.jsp">글 쓰기</a>
		<br><br>
		<a href="deleteProducts.do?P_code=<%=products.getP_code() %>">글삭제</a>
</div>

</body>
</html>