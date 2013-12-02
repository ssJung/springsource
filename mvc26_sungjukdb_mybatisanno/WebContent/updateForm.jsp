<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	body *{font-size: 9pt;}
	table{border: 2px solid gray;font-size: 9pt;}
	tr,td,th{font-size: 9pt;border: 1px dotted green;}
</style>
</head>
<body>
<form action="update.do" method="post">
	<table width="200">
		<tr>
			<th width="60">이 름</th>
			<td><input type="text" size="10" name="name" value="${dto.name}"></td>
		</tr>
		<tr>
			<th width="60">JAVA</th>
			<td><input type="text" size="5" name="java" value="${dto.java}"></td>
		</tr>
		<tr>
			<th width="60">JSP</th>
			<td><input type="text" size="5" name="jsp" value="${dto.jsp }"></td>
		</tr>
		<tr>
			<th width="60">SPRING</th>
			<td><input type="text" size="5" name="spring" value="${dto.spring }"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="hidden" name="num" value="${dto.num}">
				<input type="submit" value="성적수정">
			</td>
		</tr>
	</table>
</form>
</body>
</html>







