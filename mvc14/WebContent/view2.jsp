<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>WorldActionController 로부터 호출</h3>
<h4>오늘날짜 : ${date}</h4>
<h4>오늘날짜 : 
<fmt:formatDate value="${date}"
	pattern="yyyy-MM-dd HH:mm EEEE"/></h4>
<h4>오늘날짜 : 
<fmt:formatDate value="${date}"
	pattern="yyyy-MM-dd a hh:mm EEE"/></h4>
	
<h4>나의 이름은 ${name} 입니다</h4>
</body>
</html>





