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
	<div>박승수</div>
	<ul>
		<li>201632029</li>
		<li>정보통신학과</li>
		<li>JSP 열공</li>
	</ul>
	<h1>JSP프로그래밍 예제</h1>
	<%--이부분은 주석 --%>
	<%
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=i;
		}
	%>
	<p>1~99까지의 합은<%=sum %></p>
</body>
</html>