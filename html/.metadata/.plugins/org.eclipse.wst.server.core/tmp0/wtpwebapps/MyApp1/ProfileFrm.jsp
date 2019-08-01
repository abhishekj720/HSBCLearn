<%@ include file="Meta.jsp"%>
<html>
<%@ include file="HeadSection.jsp"%>
<%!
public void jspInit(){
	System.out.println("ProfileFrm jsp init");
}
public void jspDestroy(){
	System.out.println("ProfileFrm jsp destroy");
}
%>
<body>
	<%@ include file="Header.jsp"%>
	<%System.out.println(request.getRemoteAddr()); %>
	<h2>Update Profile</h2>
	<form action="ProfileSubmit.jsp">
	
		<table>
			<tr>
				<th>Name</th>
				<td><input type="text" name="txtname"></td>
			</tr>
			<tr>
				<th>Skills</th>
				<td><input type="checkbox" name="chkskills" value="java" />java<br />
					<input type="checkbox" name="chkskills" value="jee" />jee<br /> 
					<input type="checkbox" name="chkskills" value="spring" />spring<br /> 
					<input type="checkbox" name="chkskills" value="hibernate" />hibernate<br />
					<input type="checkbox" name="chkskills" value="angular" />angular<br />
					<input type="checkbox" name="chkskills" value="python" />python</td>

			</tr>
			<tr>
				<th>Locations</th>
				<td><select name="cbolocations" multiple>
						<option value="Chennai" selected>Chennai</option>
						<option value="Hyderabad" selected>Hyderabad</option>
						<option value="Bangalore" selected>Bangalore</option>
						<option value="Pune" selected>Pune</option>
						<option value="Delhi" selected>Delhi</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center" class="last"><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>