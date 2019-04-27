var webroot;

$("[value='返回']").click(function(){
	toJump("pages/main.jsp");
});

$("[value='提交']").click(function(){
	var title = $("[name='title']").val();
	var categoryid = $("[type='hidden']").val();
	var screateDate = $("[name='screateDate']").val();
	if(screateDate==""){
		alert("上传时间不能为空")
		return false;
	}
	if(title==""){
		alert("名称不能为空")
		return false;
	}
	if(categoryid==''){
		alert("未选分类！")
		return false;
	}
	var addData = $("form").serialize();
	console.log(addData);
	toJump("entry/add",addData);
});

