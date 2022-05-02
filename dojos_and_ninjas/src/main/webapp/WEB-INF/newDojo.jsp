<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Dojo</h1>
	
	<form:form action="/dojos" method="post" modelAttribute="dojo">
		<p>
			Name Your Dojo!
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		
		<input type="submit" value="create Your Dojo!"/>
	</form:form>
	
	<c:forEach items="${dojos}" var="d">
		<li><c:out value="${d.name}"/></li>
	</c:forEach>
	
</body>
</html>