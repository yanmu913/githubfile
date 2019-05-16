var webroot;

$("[value='返回']").click(function(){
	toJump("pages/main.jsp");
});

$("[value='保存']").click(function(){
	var modifyData = $("form").serialize();
	console.log(modifyData);
	toJump("student/update",modifyData);
});

