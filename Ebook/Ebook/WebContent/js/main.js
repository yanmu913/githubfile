var webroot
$(document).ready(function(){
	function initCategory(){
		$.post(
			webroot+"/category/find",
			function(data){
				$(".main").html(data)
			},
			"html"
		)
	}
	initCategory();
	
	function initEntry(){
		$.post(
			webroot+"/entry/find",
			function(data){
				$(".main").html(data)
			},
			"html"
		)
	}
	initEntry();
})	