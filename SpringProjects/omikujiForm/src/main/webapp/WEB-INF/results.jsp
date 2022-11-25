<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="bg-primary boarder mx-auto" style="width: 500px;">
			<%-- p>
			in <c:out value="${numbers}"></c:out> years, you will live in <c:out value="${city}"></c:out>
			with <c:out value="${name}"></c:out> as your roommate, <c:out value="${interest}"></c:out> for a living.
			The next time you see a <c:out value="${living}"></c:out> you will have good luck.
			Also, <c:out value="${something}"></c:out>
			
			</p> --%>
			<h4>
			<c:out value="${result}"></c:out>
			</h4>
		</div>
		<div>
		
			<a href="/omikuji" class="card-link">Go back</a>
		</div>
	
	</div>


</body>
</html>
