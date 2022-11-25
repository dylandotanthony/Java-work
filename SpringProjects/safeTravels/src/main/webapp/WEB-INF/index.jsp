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
<title>Travels</title>
</head>
<body>

<div>
	<h1>Safe Travels</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
			</tr>
	
		</thead>
				
		<tbody>
		<c:forEach var="eachExpense" items="${expenses}">
			<tr>
				<td><a href="/expenses/${eachExpense.id}"><c:out value="${eachExpense.name}"/></a></td>
				<td><c:out value="${eachExpense.vendor}"/></td>
				<td>$<c:out value="${eachExpense.price}"/></td>
				<td><a href="/edit/<c:out value="${eachExpense.id}"/>">edit</a> 
				<form action="/expenses/${eachExpense.id}" method="post">
				    <input type="hidden" name="_method" value="delete">
				    <input type="submit" value="Delete" class="btn-danger">
				</form>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	
	</table>
</div>
<div>
	<h2>Add an Expense:</h2>
		<form:form action="/expenses" method="post" modelAttribute="expense">
			<div>
				<form:label path="name">Expense Name:</form:label>
				<form:errors path="name" class="error"/>
				<form:input path="name" type="text" />
			</div>
			
			<div>
				<form:label path="vendor">Vendor:</form:label>
				<form:errors path="vendor" class="error"/>
				<form:input path="vendor" type="text"/>
			</div>
			
			<div>
				<form:label path="price">Price:</form:label>
				<form:errors path="price" class="error"/>
				<form:input path="price" type="number"/>
			</div>
			<div>
				<form:label path="description">Description:</form:label>
				<form:errors path="description" class="error"/>
				<form:input path="description" type="text"/>
			</div>
			
			<input type="submit" value="Add Expense" />
		
		</form:form>
</div>


</body>
</html>