<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />     
<h1 class="text-center">All Languages</h1>
<table class="table table-sm">
    <thead>
        <tr class="table-dark">
            <th scope="row">Name</th>
            <th scope="row">Creator</th>
            <th scope="row">Version</th>
            <th scope="row">Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="language">
        <tr class="table-success">
            <td scope="row"><a class="link-dark" href="languages/<c:out value="${language.id}"/>"><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.version}"/></td>
            <td><form action="/languages/<c:out value="${language.id}"/>" method="post">
            <div class="d-flex flex-column bd-highlight"></div>
        <div class="p-2 bd-highlight"><input type="hidden" name="_method" value="delete"></div>
	    <input class="btn btn-secondary" type="submit" value="Delete"></form>
		<form action="languages/edit/${language.id}" method="get">
		<input class="btn btn-light" type="submit" value="Edit"/></form></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<hr/>
 <!------------------- New Language form ----------------------------------->
<h1>Create A New language</h1>
<form:form action="/languages" method="post" modelAttribute="createNew">
    <p class="col-md-3 position-relative">
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input class="form-label" path="name"/>
    </p>
    <p class="col-md-3 position-relative">
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input class="form-label" path="creator"/>
    </p>
    <p class="col-md-3">
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input class="form-label" path="version"/>
    </p>  
    <input class="btn btn-success" type="submit" value="Submit"/>
</form:form>   