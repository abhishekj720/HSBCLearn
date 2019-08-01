<%@ include file="Meta.jsp"%>
<html>
<%@ include file="HeadSection.jsp"%>
<body>
	<%@ include file="Header.jsp"%>

	<h2>Your updated skills and locations</h2>
	<table>
		<tr>
			<th>Name</th>
			<td><%=request.getParameter("txtname")%></td>
		</tr>
		<tr>
			<th>Skills</th>
			<td><ul>
					<%
						String[] skills = request.getParameterValues("chkskills");
						for (String skill : skills) {
							out.println("<li>" + skill + "</li>");
						}
					%>
				</ul></td>
		</tr>
		<tr>
			<th>Location</th>
			<td><ul>
					<%
						String[] locs = request.getParameterValues("cbolocations");
						for (String loc : locs) {
							out.println("<li>" + loc + "</li>");
						}
					%>
				</ul></td>
		</tr>
	</table>

</body>
</html>