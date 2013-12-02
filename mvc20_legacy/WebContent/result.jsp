<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="300">
	<tr>
		<th>코드</th><th>상품</th><th>수량</th><th>단가</th>
	</tr>
	<c:forEach var="s" items="${list}">
		<tr>
			<td>${s.code}</td>
			<td>${s.pum}</td>
			<td>${s.su}</td>
			<td>${s.dan}</td>
		</tr>		
	</c:forEach>
</table>
</body>
</html>