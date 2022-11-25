<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h2>Edit an Expense:</h2>
		
		<form:form action="/expenses/${expense.id}" method="post" modelAttribute="expense" >
			
			<input type="hidden" name="_method" value="put">
			<div>
				<form:label path="name">Name of Product(s):</form:label>
				<form:errors path="name" class="error"/>
				<form:input path="name" type="text" />
			</div>
			
			<div>
				<form:label path="description">Description:</form:label>
				<form:errors path="description" class="error"/>
				<form:input path="description" type="text" />
			</div>
			
			<div>
				<form:label path="vendor">Vendor:</form:label>
				<form:errors path="vendor" class="error"/>
				<form:input path="vendor" type="text" />
			</div>
			
			<div>
				<form:label path="price">Price:</form:label>
				<form:errors path="price" class="error"/>
				<form:input path="price" type="number" />
			</div>
			
			<input type="submit" value="Update" />
		
		</form:form>
</body>
</html>