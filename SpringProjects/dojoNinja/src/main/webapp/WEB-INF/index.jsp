<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
</head>
<body>
<h2>  <c:out value="${dojo.name}"/> </h2>

	<div>
 <c:forEach items="${ ninjas }" var="ninja">
	<c:out value="${ ninja.firstName }" > </c:out>
	<c:out value="${ ninja.lastName }" ></c:out>
	<c:out value="${ ninja.age }" > </c:out>

</c:forEach>
	</div>
			
</body>
</html>