<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello World</title>
</head>
<body>
	<p>Hello World</p>
	<div>�ڽ¼�</div>
	<ul>
		<li>201632029</li>
		<li>��������а�</li>
		<li>JSP ����</li>
	</ul>
	<h1>JSP���α׷��� ����</h1>
	<%--�̺κ��� �ּ� --%>
	<%
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=i;
		}
	%>
	<p>1~99������ ����<%=sum %></p>
</body>
</html>