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
<form action="insert.do" method="post">
	<table width="200">
		<tr>
			<th width="60">�� ��</th>
			<td><input type="text" size="10" name="name"></td>
		</tr>
		<tr>
			<th width="60">JAVA</th>
			<td><input type="text" size="5" name="java"></td>
		</tr>
		<tr>
			<th width="60">JSP</th>
			<td><input type="text" size="5" name="jsp"></td>
		</tr>
		<tr>
			<th width="60">SPRING</th>
			<td><input type="text" size="5" name="spring"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="��������">
			</td>
		</tr>
	</table>
</form>
</body>
</html>







