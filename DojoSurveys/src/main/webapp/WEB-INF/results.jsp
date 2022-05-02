<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h3>Submitted Info</h3>
	<p>Name: <c:out value="${form_name}"/></p>
	<p>Dojo Location: <c:out value="${form_location}"/></p>
	<p>Favorite Language: <c:out value="${form_language}"/></p>
	<p>Comment: <c:out value="${form_comment}"/></p>
	<a href="/"><button>Go Back</button></a>
</body>
</html>