<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body * {
	font-size: 9pt;
}

table {
	border: 2px solid gray;
	font-size: 9pt;
}

tr,td,th {
	font-size: 9pt;
	border: 1px dotted green;
}
</style>
</head>
<body>
	<table width="600">
		<tr bgcolor="#ffffaa">
			<td colspan="8" align="right"><a href="insert.do">데이타추가</a></td>
		</tr>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>java</th>
			<th>jsp</th>
			<th>spring</th>
			<th>합계</th>
			<th>평균</th>
			<th>수정/삭제</th>
		</tr>
		<c:if test="${cnt==0}">
			<tr>
				<td colspan="8" align="center">저장된 데이타가 없습니다</td>
			</tr>
		</c:if>
		<c:if test="${cnt>0}">
			<c:forEach var="a" items="${list}" varStatus="i">
				<c:set var="sum" value="${a.java+a.jsp+a.spring}" />
				<c:set var="avg" value="${sum/3}" />
				<tr align="right">
					<th align="center">${i.count}</th>
					<td align="center">${a.name}</td>
					<td>${a.java }</td>
					<td>${a.jsp }</td>
					<td>${a.spring }</td>
					<td>${sum}</td>
					<td>
						<fmt:formatNumber pattern="0.00" value="${avg}"/>
					</td>
					<td align="center">
						<a href="update.do?num=${a.num}">수정</a>/ 
						<a href="delete.do?num=${a.num}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>








