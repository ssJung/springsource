<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>자료 입력: Spring Tag</h2>
<%-- <form:form commandName="command"> --%><!-- command일경우 생력가능 -->
<form:form>
	id : <form:input path="userid"/><br>
	pwd : <form:password path="passwd" showPassword="false"/><br>
	<input type="submit" value="전송">	
</form:form>
</body>
</html>