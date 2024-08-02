<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="com.netjstech.model.Person"/>
	
	<jsp:setProperty name = "person" property="id" value="1" />
	<jsp:setProperty name = "person" property="name" value="Ramesh" />
	<jsp:setProperty name = "person" property="age" value="50000" />
	
	<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

xmlns="http://xmlns.jcp.org/xml/ns/javaee"

xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"

id="WebApp_ID" version="4.0">
	</jsp:attribute>
</body>
</html>