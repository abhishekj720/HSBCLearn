<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
<%@include file="Header.jsp"%>
<form action="emi">
	<table>
		<tr>
			<th>Name</th>
			<td><input type="text" name="txtname" /></td>
		</tr>
		<tr>
			<th>Loan Amount</th>
			<td><input type="number" name="txtamt" /></td>
		</tr>
		<tr>
			<th>Years</th>
			<td><select name="years">
			<option value="">"--------select years------"</option>
			<option value="5">5</option>
			<option value="10">10</option>
			<option value="15">15</option>
			<option value="20">20</option>
			</select>
			</td>
		</tr>
	
	    <tr>
			<td colspan="2" align="center" class="last">
				<input type="submit" value="calc emi" />
			</td>
		</tr>	
	</table>
</form>

</body>
</html>