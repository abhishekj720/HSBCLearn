<%@include file="Meta.jsp" %>
<html>
<%@include file="HeadSection.jsp" %>
<body>
<%@include file="Header.jsp" %>
<h2>Tax Calculation</h2>
<hr/>
<form action ="tax">
<table>
	<tr>
		<th>Name</th>
		<td>
		<input type="text" name="txtname"/>
		</td>
	</tr>
	<tr>
		<th>Annual Income</th>
		<td><input type="text" name="txtincome"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center" class="last"><input type="submit" value="calc tax"/></td>

	</tr>
	</table>
</form>

</body>
</html>