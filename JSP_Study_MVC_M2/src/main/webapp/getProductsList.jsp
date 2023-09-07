<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import = "java.util.*" %>
    <%@page import = "com.mysite.products.ProductsDTO" %>
    
    <%
    	//새션에 저장된 값을 끄집어 낸다.
    		List<ProductsDTO> productsList = new ArrayList<ProductsDTO>(); 

	productsList = (List<ProductsDTO>) session.getAttribute("productsList"); 
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		width:750px;
		margin:0 auto;
	}

</style>


</head>
<body>
		<div>
		<h1>물품</h1>
		<table border="1px" cellpadding="0" cellspacing="0" width="700px">
		<tr>
		<th bgcolor="orange" width="200px">코드</th>
		<th bgcolor="orange" width="200px">이름</th>
		<th bgcolor="orange" width="200px">종류</th>
		<th bgcolor="orange" width="200px">가격</th>
		<th bgcolor="orange" width="200px">내용</th>
		<th bgcolor="orange" width="200px">상품</th>
		<th bgcolor="orange" width="200px">날짜</th>
		</tr>
				<!-- DB에 값을 가져와서 루프 시작 -->
		<%
			for(ProductsDTO k : productsList){
		
		
		%>
		<tr>
			<td><%=k.getP_code() %></td>
			<!--제목에 링크를 걸어서 글의 상세 페이지 출력  -->
			<td>
				<a href="getProducts.do?P_code=<%=k.getP_code() %>">
				</a>
			</td>
			<td><%=k.getP_name() %></td>
			<td><%=k.getP_kind() %></td>
			<td><%=k.getP_price() %></td>
			<td><%=k.getP_quantity() %></td>
			<td><%=k.getIndate() %></td>
		
		
		</tr>
					<!--  루프 끝  -->
			<%
				}
			
			//session 객체의 저장된 변수 제거  : 모두 사용후 
			session.removeAttribute("productsList"); 
			
			%>
		
		</table>
				<br><br>
				<a href="InsertBoard.jsp">새 글 등록</a><p/>
				<a href="/JSP_Study_MVC_M2">처음으로 이동</a>
		</div>
</body>
</html>