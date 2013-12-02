<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="100%">
	<tr height="70" bgcolor="#ffffaa">
		<td colspan="2">
			<tiles:insertAttribute name="header"/>
		</td>
	</tr>
	<tr height="400">
		<td width="15%" bgcolor="#ffddff">
			<tiles:insertAttribute name="menu"/>
		</td>
		<td>
			<tiles:insertAttribute name="body"/>
		</td>
	</tr>
	<tr height="70"  bgcolor="#ffffaa">
		<td colspan="2">
			<tiles:insertAttribute name="footer"/>
		</td>
	</tr>
	
</table>
</body>
</html>