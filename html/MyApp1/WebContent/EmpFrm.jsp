<%@ include file="Meta.jsp"%>
<html>
<%@ include file="HeadSection.jsp"%>

<body>
<%@ include file="Header.jsp"%>
<h2>Salary Calculation</h2>
<form action="EmpSubmit.jsp">
	<table>
		<tr>
			<th>Name</th>
			<td><input type="text" name="txtname" /></td>
		</tr>
		<tr>
			<th>Salary</th>
			<td><input type="number" name="txtsal" /></td>
		</tr>
	
	    <tr>
			<td colspan="2" align="center" class="last">
				<input type="submit" value="calc Salary" />
			</td>
		</tr>
	
	
	
	</table>

</form>


</body>
</html>

