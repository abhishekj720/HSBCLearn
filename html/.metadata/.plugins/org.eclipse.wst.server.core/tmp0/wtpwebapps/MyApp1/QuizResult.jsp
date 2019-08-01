<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<h2>Quiz Result</h2>
	<table>
		<tr>
			<th>Score</th>
			<td><%=request.getAttribute("score") %></td>
		</tr>
		<tr>
			<th>Percentage</th>
			<td><%=(int)request.getAttribute("score")*25 %></td>
		</tr>
		<tr>
			<th>Result</th>
			<td><%=request.getAttribute("result") %></td>
		</tr>
	</table>
</body>
</html>