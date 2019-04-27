var webroot
var curr;
var count;


$("#pageChange a").each(function(){
	var aText = $(this).text()
	switch (aText) {
	case "首页":
		fun = function() {
			findBook(1);
		};
		break;
	case "上一页":
		fun = function() {
			findBook(curr - 1);
		};
		break;
	case "下一页":
		fun = function() {
			findBook(curr + 1);
		};
		break;
	case "尾页":
		fun = function() {
			findBook(count);
		};
		break;
	}	
	$(this).bind("click", fun);
})

$(":button").each(function() {
	var buttonVal = $(this).val();
	switch (buttonVal) {
//	case "首页":
//		fun = function() {
//			findBook(1);
//		};
//		break;
//	case "上一页":
//		fun = function() {
//			findBook(curr - 1);
//		};
//		break;
//	case "下一页":
//		fun = function() {
//			findBook(curr + 1);
//		};
//		break;
//	case "尾页":
//		fun = function() {
//			findBook(count);
//		};
//		break;
	case "查询":
		fun = function() {
			var categoryData = $("#category").val();
			toJump("entry/find", "categoryid="+categoryData);
		};
		break;
	case "新增":
		fun = function() {
			var categoryData = $("#category").val();
			console.log(categoryData);
			toJump("pages/add.jsp?categoryid="+categoryData);
//			location=webroot+"/pages/add.jsp?"+"categoryid="+categoryData;
		};
		break;
	}
	$(this).bind("click", fun);
});

function findBook(pageNum) {
	var categoryData = $("#category").val();
	toJump("entry/find", {"currPage": pageNum,"categoryid":categoryData});
};


$(".delete").each(function(){
	fun1=function(){
		if(!confirm("确认删除吗？")){
			return;
		}
		var id=$(this).parent().siblings(".id").text();
		toJump("entry/delete","id="+id);
	}
	$(this).bind("click",fun1);
})

$(".modify").each(function(){
		
		
		fun2=function(){
			var id=$(this).parent().siblings(".id").text();
			toJump("pages/modify.jsp?id="+id);
		}
		$(this).bind("click",fun2);
})
	

