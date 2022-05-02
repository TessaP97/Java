<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<%@ page isErrorPage="true" %>
<!-- ^ this tells spring that the edit page has errors  -->   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<a class="link-success" href="/languages">Dashboard</a>  
<h1>Edit Language</h1>
<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
<!-- ^ this tells spring that the page is a post method but is overridden by value being a put request --> 
<!-- access to one specific language comes from the language Object through the modelAttribute stored in the controller --> 
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>   
    <input class="btn btn-success" type="submit" value="Submit"/>
	</form:form>
    <hr/>
<!------------------------ delete section ------------------------------->
    <form action="/languages/${language.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input class="btn btn-danger" type="submit" value="Delete"></form>