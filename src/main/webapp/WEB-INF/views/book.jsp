<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
	table{
	margin : auto;
	background-color : Thistle;
	}
</style>
</head>
<body style="background-color : Silver">
	<h1 style="text-align : center;">Book Info</h1>
	<br>
	<br>
	<table style="with: 50%" border="2">
		<tr>
			<td>Book Id</td>
			<td>Book Name</td>
			<td>Author</td>
		</tr>
		<tr>
			<td>${book.bookid}</td>
			<td>${book.bookname}</td>
			<td>${book.author}</td>
		</tr>
	</table>	
	<div style="text-align : center">
		<a style="margin : auto; padding-top : 10px;" href="/bookapp"> Click here to go to index page</a>
	</div>		
</body>
</html>