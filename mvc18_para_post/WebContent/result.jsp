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
<h4>�����ִ� �͸� ������ �ִ°��� �ƴ϶�</h4>
<h4>��Ʈ�ѷ� ��ü�� ���� �����Ͽ� ����Ÿ�� �����ü��� �ִ�</h4>
��ǰ:${sangpumBean.sang}<br>
�ѱݾ� : ${sangpumBean.su*sangpumBean.dan}<br>
<h4>��Ʈ�ѷ����� @ModelAttribute("my")�� �־��ٸ� my�θ� ���� ���� </h4>
��ǰ:${my.sang}<br>
�ѱݾ� : ${my.su*my.dan}<br>
</body>
</html>