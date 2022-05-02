<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
</head>
<body>
	<h1>Dojo Survey</h1>
	<form method="POST" action="/login">
    	<label>Your Name: <input type="text" name="name"></label>
    	<br/>
    	<label>Dojo Location:</label>
    	<br/>
    	<select name="location">
    		<option value="San Francisco">San Francisco</option>
    		<option value="Los Angeles">Los Angeles</option>
    		<option value="Berkley">Berkley</option>
    		<option value="New York">New York</option>
    	</select>
    	<br/>
    	<label>Favorite Language:</label>
    	<br/>
    	<select name="language">
    		<option value="MERN">MERN</option>
    		<option value="Python">Python</option>
    		<option value="Java">Java</option>
    		<option value="JavaScript">JavaScript</option>
    	</select>
    	<br/>
    	<label>Comments(optional):</label>
    	<br/>
    	<textarea name="comment" rows="10" cols="30">Your Comment here...</textarea>
    	<br/>
    	<button>Submit</button>
	</form>

	<hr/>
</body>
</html>