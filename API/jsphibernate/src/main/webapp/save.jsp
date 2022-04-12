<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	Cookie[] s = request.getCookies();
	 %>
	<h1>Thank you for coming, <%=s[1].getValue() %></h1>
</body>
</html>