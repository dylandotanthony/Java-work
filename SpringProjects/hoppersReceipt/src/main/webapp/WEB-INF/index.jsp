<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Hoppers Receipt</title>
		
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/style.css"/>
		<!-- for Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local JS -->
		<script type="text/javascript" src="js/app.js"></script>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
<body>
    <div class="card">
    <h1>Customer Name: <c:out value="${name}"/></h1>
    <p class="text-muted">Item name: <c:out value="${item}"/></p>
    <p>Price: <c:out value="${price}"/></p>
    <p>Description: <c:out value="${description}"/></p>
    <p>Vendor: <c:out value="${vendor}"/></p>
    
    </div>

</body>
</html>
