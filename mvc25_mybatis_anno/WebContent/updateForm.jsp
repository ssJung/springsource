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
<form action="update.do" method="post">
<table width="250">
	<caption><b>**����Ÿ ����</b></caption>
	<tr>
		<th>�� ��</th>
		<td><input type="text" name="name" size="10" value="${dto.name}"></td>
	</tr>
	<tr>
		<th>�� ��</th>
		<td><input type="text" name="addr" size="20" value="${dto.addr}"></td>
	</tr>
	<tr>
		<th>������</th>
		<td>
			<select name="blood" size="1">
				<option value="A">A��</option>
				<option value="O">O��</option>
				<option value="B">B��</option>
				<option value="AB">AB��</option>
			</select>
		</td>
	</tr>
	<tr align="center">
		<td colspan="2">
		<input type="hidden" name="num" value="${dto.num}">
		<input type="submit" value="����">		
		</td>
	</tr>
</table>
</form>
</body>
</html>




