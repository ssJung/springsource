<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	tr,td,th{font-size:10pt; border: 1px solid gray;}
</style>
<script type="text/javascript">
	function del(num){
		var ans=confirm('�����Ͻ÷��� [Ȯ��]�� �����ּ���');
		if(ans){
			location.href='delete.do?num='+num;
		}
	}
</script>
</head>
<body>
<h2>** ���� ���� [myBatis]**</h2><br>
<a href="insert.do">�߰�</a><br>
<table border="1" cellpadding="0" cellspacing="0" width="400">
	<tr bgcolor="orange">
		<th width="50">��ȣ</th>
		<th width="60">�̸�</th>
		<th width="150">�ּ�</th>
		<th width="60">������</th>
		<th>����/����</th>
	</tr>
	<c:forEach var="a" items="${list}" varStatus="i">
		<tr align="center">
			<td>${i.count}</td>
			<td>${a.name}</td>
			<td>${a.addr}</td>
			<td>${a.blood}</td>
			<td>
				<a href="update.do?num=${a.num}">����</a>
				/
				<a href="delete.do?num=${a.num}">����</a>
				/
				<a href="javascript:del('${a.num}')">����2</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>






