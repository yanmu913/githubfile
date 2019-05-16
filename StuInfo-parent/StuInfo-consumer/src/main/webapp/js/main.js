var webroot
$(document).ready(function(){
	function initCategory(){
		$.post(
			webroot+"/student/find",
			function(data){
				$(".main").html(data)
			},
			"html"
		)
	}
	initCategory();
	
	function initEntry(){
		$.post(
			webroot+"/classes/find",
			function(data){
				$(".main").html(data)
			},
			"html"
		)
	}
	initEntry();
})	