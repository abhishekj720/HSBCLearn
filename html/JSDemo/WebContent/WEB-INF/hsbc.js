function validate(){
	document.getElementById("err1").innerHTML="";
	document.getElementById("err2").innerHTML="";
	document.getElementById("err3").innerHTML="";
	var name=frm1.txtname.value;
	var age=frm1.txtage.value;
	var email=frm1.txtemail.value;
	var res=true;
	if(!validateName(name)){
		document.getElementById("err1").innerHTML="Name must contain 3-15 alphabets";
		res=false;
	}
	if(!validateAge(age)){
		document.getElementById("err2").innerHTML="Age must be 2 digits";
		res=false;
	}
	if(!validateEmail(email)){
		document.getElementById("err3").innerHTML="Invalid email";
		res=false;
	}
	return res;
}
function validateName(name){
	var namepatt=/^[a-zA-Z]{3,15}$/;
	return namepatt.test(name);
}
function validateAge(age){
	var agepatt=/^[0-9]{1,2}$/;
	return agepatt.test(age);
}
function validateEmail(email){
	var emailpatt=/^[a-zA-Z]+[@][a-z]+[.]{com|co.in}$/;
	return emailpatt.test(email);
}