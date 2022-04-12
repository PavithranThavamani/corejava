<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String s = request.getParameter("name"); %>
<% Cookie c = new Cookie("name", s);
    response.addCookie(c);%>
<marquee><h1 >Welcome <%= s %></h1></marquee>
<form action="./message" method="post">

<label><b>Message : </label>
<textarea placeholder="enter the message"></textarea><br><br>
<input type="submit" value="send">
</form>
<h3>1 to 10</h3>

<% for(int i = 1; i <= 10; i++ ) { %>
<%= i %>
<%} %>
</body>
</html>