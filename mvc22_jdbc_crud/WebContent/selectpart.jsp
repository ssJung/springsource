<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	tr,td,th{font-size: 9pt;border: 1px solid gray;}
	table{border:2px solid red; width:200px;}
</style>
</head>
<body>
<h2>[상세 보기]</h2>
<hr>
<table>
	<tr>
		<th width="80"bgcolor="#ffff55">아이디</th>
		<td>${member.id}</td>
	</tr>
	<tr>
		<th width="80"bgcolor="#ffff55">비밀번호</th>
		<td>${member.passwd}</td>
	</tr>
	<tr>
		<th width="80"bgcolor="#ffff55">이  름</th>
		<td>${member.name}</td>
	</tr>
	<tr>
		<th width="80"bgcolor="#ffff55">등록일</th>
		<td>${member.reg_date}</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<a href="list.do">목록</a>&nbsp;&nbsp;
			<a href="update.do?id=${member.id}">수정</a>&nbsp;&nbsp;
			<a href="delete.do?id=${member.id}">삭제</a>			
		</td>
	</tr>
</table>
</body>
</html>




