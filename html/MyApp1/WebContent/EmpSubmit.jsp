<%@ include file="Meta.jsp"%>
<html>
<%@ include file="HeadSection.jsp"%>

<body>
<%@ include file="Header.jsp"%>
<h2>Emp Salary Calculation</h2>
<jsp:useBean id="ebean" class="com.hsbc.beans.EmpBeans" scope="page" type="com.hsbc.beans.EmpBeans"/>
<jsp:setProperty property="name" name="ebean" param="txtname"/>
<jsp:setProperty property="sal" name="ebean" param="txtsal"/>

	<table>
		<tr>
			<th>Name</th>
			<td><jsp:getProperty name="ebean" property="name" /></td>
		</tr>
		<tr>
			<th>Salary</th>
			<td><jsp:getProperty name="ebean" property="sal" /></td>
		</tr>
		<tr>
			<th>HRA</th>
			<td><jsp:getProperty name="ebean" property="hra" /></td>
		</tr>
		<tr>
			<th>PF</th>
			<td><jsp:getProperty name="ebean" property="pf" /></td>
		</tr>
		<tr>
			<th>TAX</th>
			<td><jsp:getProperty name="ebean" property="tax" /></td>
		</tr>
		<tr>
			<th>Net Salary</th>
			<td><jsp:getProperty name="ebean" property="netSal" /></td>
		</tr>
	 
	
	</table>
	</body>
</html>
