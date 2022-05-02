<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Show Page</title>
</head>
<body>
	<h1>
	<c:out value="${product.name}"/>
	</h1>
	
	<form action="/products/${product.id}" method="post">
		Add a category: <br/>
		<select name="categoryId">
			<c:forEach items="${categories}" var="cat">
				<option value="${cat.id}">${cat.name}</option>			
			</c:forEach>
		</select>
		<button>Add Category</button>
	</form>
	<hr/>
	${product.name} is part of these categories:
	<p>
		<c:forEach items="${product.categories}" var="cc">
			<li>${cc.name}</li>
		</c:forEach>
	</p>
</body>
</html>