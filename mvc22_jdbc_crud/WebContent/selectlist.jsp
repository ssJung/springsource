<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<basefont size="2">
<h3>** 회원 목록 **</h3><br>
<c:if test="${count==0}">
	출력할 자료가 없습니다<br>
	<a href="insert.do">회원 등록</a>
</c:if>
<c:if test="${count>0}">
	<table border="1" cellpadding="0" cellspacing="0" width="200">
		<tr bgcolor="#ffddff">
			<td colspan="2">
				<a href="insert.do">회원등록</a>
			</td>
		</tr>
		<tr bgcolor="#ffffaa">
			<th>아이디</th><th>이름</th>
		</tr>
		<c:forEach var="m" items="${list}">
			<tr>
				<td>${m.id}</td>
				<td>
					<a href="detail.do?id=${m.id}">${m.name}</a>
				</td>
			</tr>			
		</c:forEach>
	</table>
	
	<!-- 페이지 링크걸기 -->
	<c:if test="${count>0}">
		<!-- pageCount 소수 이하 버리기 작업 필요 -->
		<fmt:parseNumber var="pageCount"
		 value="${(count-1)/pageSize+1}" integerOnly="true"/>
		 
		 <c:set var="pageBlock" value="${5}"/>
		 <fmt:parseNumber var="rs"
		  value="${(currentPage-1)/pageBlock}"
		   integerOnly="true"/>
		  
		  <c:set var="startPage" value="${rs*pageBlock+1}"/>
		  <c:set var="endPage" value="${startPage+pageBlock-1}"/>
		  
		  <c:if test="${endPage>pageCount}">
		  	<c:set var="endPage" value="${pageCount}"/>
		  </c:if>
		  <c:if test="${startPage>pageBlock}">
		  	<a href="list.do?pageNum=${startPage-pageBlock}">이전</a>
		  </c:if>
		  
		  <c:forEach var="i" begin="${startPage}" end="${endPage}">
		  	<c:if test="${i==currentPage}">
		  		<font color="red">[${i}]</font>
		  	</c:if>
		  	<c:if test="${i!=currentPage}">
		  		<a href="list.do?pageNum=${i}">[${i}]</a>
		  	</c:if>
		  </c:forEach>
		  
		  <c:if test="${endPage<pageCount}">
		  	<a href="list.do?pageNum=${startPage+pageBlock}">[다음]</a>
		  </c:if>
	</c:if>
</c:if>
</body>
</html>













