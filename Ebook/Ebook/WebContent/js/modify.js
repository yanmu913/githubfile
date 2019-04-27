var webroot;

$("[value='返回']").click(function(){
	toJump("pages/main.jsp");
});

$("[value='提交']").click(function(){
	var title = $("[name='title']").val();
	if(title==""){
		alert("名称不能为空")
		return false;
	}
	var modifyData = $("form").serialize();
	console.log(modifyData);
	toJump("entry/update",modifyData);
});

