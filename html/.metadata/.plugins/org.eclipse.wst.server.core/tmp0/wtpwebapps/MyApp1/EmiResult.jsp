<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<h2>EMI Calculator</h2>
	<table>
		<tr>
			<th>Name</th>
			<td><%=request.getParameter("txtname") %></td>
		</tr>
		<tr>
			<th>Loan Amount</th>
			<td><%=request.getParameter("txtamt") %></td>
		</tr>
		<tr>
			<th>Years</th>
			<td><%=request.getParameter("years") %></td>
		</tr>
		<tr>
			<th>Compound Interest</th>
			<td><%=request.getAttribute("comp") %></td>
		</tr>
		<tr>
			<th>EMI</th>
			<td><%=request.getAttribute("emi") %></td>
		</tr>
	</table>
</body>
</html>