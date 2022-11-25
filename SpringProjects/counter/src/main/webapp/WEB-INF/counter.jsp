<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Visit Count</title>
</head>
<body>
<p>You have visited <a href="/"><c:out value="${page}"/> </a><c:out value="${count}"/> time(s).</p>
<p><a href="/">Test anther Visit?</a></p>
<p><a href="/double-counter">Add 2 Visits</a></p>
<p><a href="/reset-counter/">Reset Counter</a></p>
</body>
</html>