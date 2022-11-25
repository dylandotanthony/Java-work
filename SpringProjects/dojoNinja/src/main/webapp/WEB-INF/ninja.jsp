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
	<form:form method="POST" action="/ninjas/new" modelAttribute="newNinja">
		<form:hidden path="id"/>
		<select name="dojo">
		<c:forEach items="${ dojos }" var="dojo">
			<option value=<c:out value="${ dojo.id }"/> > <c:out value="${ dojo.name }"/> </option>
			
		</c:forEach>
		
	</select>
     <form:label path="firstName">First Name
     	<form:input path="firstName"/>
     </form:label><br>
     
     <form:label path="lastName">Last Name
     	<form:input path="lastName"/>
     </form:label><br>
     
     <form:label path="age">Age 
     	<form:input path="age" type="number"/>
     </form:label><br>
     
      <input type="submit" name="" value="Create Person">
    </form:form>
</body>
</html>