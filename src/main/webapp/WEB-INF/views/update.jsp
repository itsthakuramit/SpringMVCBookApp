<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	table{
	margin : auto;
	background-color : LightSeaGreen;
	}
</style>
</head>
<body style="background-color : Beige">
<h1 style="text-align : center;">Update Book</h1>
<form action="updateSave" method="post">
		<table style="with: 50%" border="2">
			<tr>
				<td>Book Id</td>
				<td><input type="text" name="bookid" value="${book.bookid}"/></td>
			</tr>
			<tr>
				<td>Book Name</td>
				<td><input type="text" name="bookname" value="${book.bookname}"/></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><input type="text" name="author" value="${book.author}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Update Book" /></td>
			</tr>

		</table>
	</form>
</body>
</html>