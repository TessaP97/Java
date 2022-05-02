<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Home Page</title>
</head>
<body>
	<h1>Create a product or Category here!</h1>
	<p>
		<a href="/products/new">New Product</a>
		<a href="/categories/new">New Category</a>
	</p>
	
	<h3>Products</h3>
	<table>
		<thead>
			<tr>
				<td>Name:</td>
				<td>Description:</td>
				<td>Price:</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allProducts}" var="p">
				<tr>
					<td><c:out value="${p.name}"/></td>
					<td><c:out value="${p.description}"/></td>
					<td><c:out value="${p.price}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>