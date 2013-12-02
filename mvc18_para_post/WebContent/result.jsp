<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
${data}
<hr>
<h4>보내주는 것만 받을수 있는것이 아니라</h4>
<h4>컨트롤러 객체로 직접 접근하여 데이타를 가져올수도 있다</h4>
상품:${sangpumBean.sang}<br>
총금액 : ${sangpumBean.su*sangpumBean.dan}<br>
<h4>컨트롤러에서 @ModelAttribute("my")로 주었다면 my로만 접근 가능 </h4>
상품:${my.sang}<br>
총금액 : ${my.su*my.dan}<br>
</body>
</html>