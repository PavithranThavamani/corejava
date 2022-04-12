<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import=" javax.persistence.EntityManager"
	import="javax.persistence.EntityManagerFactory"
	import="javax.persistence.EntityTransaction"
	import="javax.persistence.Persistence"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
	EntityManager manager = factory.createEntityManager();
	//manager.persist();
	%>
</body>
</html>