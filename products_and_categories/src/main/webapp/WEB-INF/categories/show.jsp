<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category To Product Page</title>
</head>
<body>
	<h1>
	<c:out value="${cat.name}"/>
	</h1>
	
	<form action="/categories/${category.id}" method="post">
		<h1>${category.name}</h1> <br/>
		<p>Add Product:</p>
		<select name="productId">
			<c:forEach items="${products}" var="prod">
				<option value="${prod.id}">${prod.name}</option>			
			</c:forEach>
		</select>
		<button>Add</button>
	</form>
	<hr/>
	<p>
		<c:forEach items="${category.products}" var="x">
			<li>${x.name}</li>
		</c:forEach>
	</p>
</body>
</html>