<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Ninja</h1>
	
	<form:form action="/ninjas" method="post" modelAttribute="ninja">
		<form:errors path="*"/>
		<p>
			First Name:
			<form:errors path="firstName"/>
			<form:input path="firstName"/>
		</p>
		<p>
			Last Name:
			<form:errors path="lastName"/>
			<form:input path="lastName"/>
		</p>
		<p>
			Age:
			<form:errors path="age"/>
			<form:input path="age"/>
		</p>
		
		<p>
			<form:label path="dojo">Select Your Dojo Location</form:label>
			<form:errors path="dojo"/>
			<form:select path="dojo">
				<option value="" disabled selected>
			<c:forEach items="${dojos}" var="dojo">
					<form:option value="${dojo.id}">${dojo.name}</form:option>
			</c:forEach>
			</form:select>
		</p>
		<input type="submit" value="create"/>
	</form:form>
	
	<hr/>
	
	<c:forEach items="${ninjas}" var="n">
		<li>
			<c:out value="${n.firstName} ---> ${n.dojo.name}"/>
		</li>
	</c:forEach>
</body>
</html>