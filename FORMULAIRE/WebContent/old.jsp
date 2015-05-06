<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page de personne agée</title>
</head>
<body>

	<jsp:useBean id="users" type="lab.mvc.model.Person" scope="request"/>
	<p>Vous êtes vieux ! </p>
	<label>First name : </label><jsp:getProperty property="firstName" name="users"/><br/>
	<label>Last name :</label><jsp:getProperty property="lastName" name="users"/><br/>
	<label>Vous êtes (un/une) </label><jsp:getProperty property="sex" name="users"/><br/>
	<label>Anniversaire :</label><jsp:getProperty property="birthDay" name="users"/><br/>
	<label>Anniversaire 2 :</label><jsp:getProperty property="birthDay" name="users"/><br/>

  
</body>
</html>