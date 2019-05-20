var cd;
$(".left ul li").each(function(){
	var fun = null; //保存需要绑定的函数
	var liStr = $(this).children("a").text();
	switch(liStr){
	case "查询余额":
		fun=function(){
		toJump("pages/info.jsp")	
	}
		break;
	case "转账":
		fun=function(){
		toJump("pages/transfer.jsp")	
	}
		break;
	case "查询交易记录":
		fun=function(){
		alert(liStr)
	}
		break;
	case "修改密码":
		fun=function(){
		alert(liStr)
	}
		break;
	}
	$(this).children("a").bind("click",fun);
})