<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<header>
		<nav>
		<a href ='<c:url value="/person?action=new"></c:url>'>Add Person</a>
		&nbsp; &nbsp; &nbsp; 
		<a href='<c:url value="/person?action=list"></c:url>'>List Persons</a>
		</nav>
	</header>
	</div>
	
</body>
</html>