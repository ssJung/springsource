<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ڷ� �߰�</title>
</head>
<body>
<h3>[�ڷ� �߰�]</h3><br>
<form:form commandName="command"> 
	���̵� : <form:input path="id"/><br>
	��й�ȣ : <form:password path="passwd" showPassword="false"/><br>
	�̸� : <form:input path="name"/><br>
	<input type="submit" value="���"/> 
</form:form>
</body>
</html>