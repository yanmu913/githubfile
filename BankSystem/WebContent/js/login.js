
var webroot;
$("[type='button']").click(function(){

	var cardno = $("[name='account.cardNo']").val();
	var password = $("[name='account.password']").val();
	 var loginData = $("form").serialize();
//	alert(cardno+"-"+password);
	if(cardno.length!=16){
		alert("请输入正确的16位卡号");
		return false;
	}
	if(password.length!=6){
		alert("请输入正确的6位密码");
		return false;
	}
	 console.log(loginData);
	 $.post(
			 webroot+"/account/account_login",
			 loginData,
			 function(data){
				 if(data.loginMes!="loginSuc"){
					 alert(data.loginMes);
				 }else{
					 location=webroot+"/pages/main.jsp"
				 }
			 }
	 )
	
})