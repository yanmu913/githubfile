
$(".modify").each(function(){	
		fun=function(){
			var id=$(this).text();
			alert(id)
			toJump("pages/modify.jsp?id="+id);
		}
		$(this).bind("click",fun);
})
	

