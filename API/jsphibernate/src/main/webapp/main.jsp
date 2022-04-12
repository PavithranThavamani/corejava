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
	
	<% String id = request.getParameter("id"); 
       String name = request.getParameter("name");
       Cookie c = new Cookie("name", name);
       response.addCookie(c);
       String salary = request.getParameter("salary");
       String designation = request.getParameter("designation");%>
       <form action="./save" method="post">
       <h1>Your details : </h1><br>
       <h2>
       		Id : <%=id %><br>
       		Name : <%=name %><br>
       		Salary : <%=salary %><br>
       		Designation : <%=designation %>
       </h2>
       <input type="submit" value="send">
       </form>
</body>
</html>