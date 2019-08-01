<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align ="center">Tax Calculation</h1>
<hr/>

<form action = "tax"> <!-- because url is tax -->
	<table cellpadding= "10" bgcolor = "wheat" style="margin:0px auto;">
		<tr>
			<td>Name</td>
			<td><input type ="text" name = "txtname"/></td>
		</tr>
		
		<tr>
			<td>Annual Income</td>
			<td><input type ="number" name = "txtincome"/></td>
		</tr>
		
		<tr>
			<td>Name</td>
			<td colspan="2 align="center" ><input type ="submmit" value = "calc tax"/></td>
		</tr>
	
	</table>




</form>

</body>
</html>