$("[value='转账']").click(function(){
	var cardno = $("[name='account.cardNo']").val();
	var transfermoney=$("[name='transferMoney']").val();
	var transferData = $("form").serialize();
	if(cardno.length!=16){
		alert("请输入正确的16位卡号")
		return false;
	}
	if(transfermoney==""){
		alert("请输入正确的转账金额")
		return false;
	}
	console.log(transferData);
	$.post(
			 webroot+"/account/account_transfer",
			 transferData,
			 function(data){
				 if(data.transMes!=null){
					 alert(data.transMes);
				 }else{
					 alert("1231231")
				 }
			 }
	 )
})

