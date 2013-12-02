<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	table{border: 2px solid black;}
	tr,td,th{font-size:9pt; color: blue; background:#ffffdd;
		border: 1px solid green;}
</style>
</head>
<body>
<form action="insert.do" method="post">
<table width="250">
	<caption><b>**데이타 추가</b></caption>
	<tr>
		<th>이 름</th>
		<td><input type="text" name="name" size="10"></td>
	</tr>
	<tr>
		<th>주 소</th>
		<td><input type="text" name="addr" size="20"></td>
	</tr>
	<tr>
		<th>혈액형</th>
		<td>
			<select name="blood" size="1">
				<option value="A">A형</option>
				<option value="O">O형</option>
				<option value="B">B형</option>
				<option value="AB">AB형</option>
			</select>
		</td>
	</tr>
	<tr align="center">
		<td colspan="2"><input type="submit" value="저장"></td>
	</tr>
</table>
</form>
</body>
</html>




