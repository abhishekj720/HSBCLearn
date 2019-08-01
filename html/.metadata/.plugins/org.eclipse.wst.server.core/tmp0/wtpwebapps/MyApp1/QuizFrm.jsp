<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<h2>Play Java Quiz</h2>
	<form action="quiz" method="post">
		<div style="width: 300px; margin: 0px auto; background-color: wheat;">
			1.What is the size of int type?<br /> 
			<input type="radio" name="ques1" value="1" />1<br /> 
			<input type="radio" name="ques1" value="2" />2<br /> 
			<input type="radio" name="ques1" value="4" />4<br />
			<input type="radio" name="ques1" value="8" />8<br />
			<hr/>
			2.What is the size of byte type?<br /> 
			<input type="radio" name="ques2" value="1" />1<br /> 
			<input type="radio" name="ques2" value="2" />2<br /> 
			<input type="radio" name="ques2" value="4" />4<br />
			<input type="radio" name="ques2" value="8" />8<br />
			<hr/>
			3.What is the size of float type?<br /> 
			<input type="radio" name="ques3" value="1" />1<br /> 
			<input type="radio" name="ques3" value="2" />2<br /> 
			<input type="radio" name="ques3" value="4" />4<br />
			<input type="radio" name="ques3" value="8" />8<br />
			<hr/>
			1.What is the size of long type?<br /> 
			<input type="radio" name="ques4" value="1" />1<br /> 
			<input type="radio" name="ques4" value="2" />2<br /> 
			<input type="radio" name="ques4" value="4" />4<br />
			<input type="radio" name="ques4" value="8" />8<br />
			<hr/>
			<div align="center"><input type="submit" value="finish"/></div>
		</div>

	</form>

</body>
</html>