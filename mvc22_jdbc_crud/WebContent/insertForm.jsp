<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>자료 추가</title>
</head>
<body>
<h3>[자료 추가]</h3><br>
<form:form commandName="command"> 
	아이디 : <form:input path="id"/><br>
	비밀번호 : <form:password path="passwd" showPassword="false"/><br>
	이름 : <form:input path="name"/><br>
	<input type="submit" value="등록"/> 
</form:form>
</body>
</html>