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
<title>New Book</title>
</head>
<body>
<h1>New Book Entry</h1>

<form:form action="/books" method="post" modelAttribute="book">
	<div>
		<form:label path="title">Title</form:label>
		<form:errors path="title" />
		<form:input type="text" path="title" />
	</div>
	<div>
		<form:label path="description">Description</form:label>
		<form:errors path="description" />
		<form:textarea path="description"/>
	</div>
	<div>
		<form:label path="language">Language</form:label>
		<form:errors path="language" />
		<form:input type="text" path="language" />
	</div>
	<div>
		<form:label path="numberOfPages">Pages</form:label>
		<form:errors path="numberOfPages" />
		<form:input type="number" path="numberOfPages"/>
	</div>
	<input type="submit" value="Submit" />
</form:form>


</body>
</html>