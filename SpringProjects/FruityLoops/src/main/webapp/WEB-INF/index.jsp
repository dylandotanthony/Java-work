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
		<!-- <link rel="stylesheet" href="/css/style.css"/> -->
		<!-- for Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local JS -->
		<script type="text/javascript" src="js/app.js"></script>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
<body>
    <h1>Fruit Store</h1>
    <table class="table table-hover">
    	<tbody>
    		<tr>
    			<th> Name </th>
    			<th> Price </th>
    		</tr>
    		<tr>
    		<c:forEach var="fruit" items="${fruits}">
    			<tr> 
    				<td>${fruit.name}</td>
    				<td>${fruit.price}</td>
    			</tr>
   		
    		</c:forEach>
	    	
    		</tr>
    	</tbody>
    
    </table>
   

</body>
</html>
