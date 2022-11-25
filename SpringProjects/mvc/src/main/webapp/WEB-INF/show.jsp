<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Info</title>
</head>
<body>
<div>

	<h1> <c:out value="${book.title}"></c:out> </h1>
	<p>Description: <c:out value="${book.description}"></c:out></p>
	<p>Language: <c:out value="${book.language}"></c:out></p>
	<p>Number of Pages: <c:out value="${book.numberOfPages}"></c:out></p>
</div>
</body>
</html>