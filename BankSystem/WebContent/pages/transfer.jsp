<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>当前操作：转账。请输入转入账号和金额后点击“转账”按钮</h3>
	<div>
		<form>
			<div>转账账号：<input type="text" name="account.cardNo"/></div>
			<div>转账金额：<input type="text" name="transferMoney"/></div>
			<div><input type="button" value="转账"/></div>
		</form>
	</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/transfer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/toJump.js"></script>
<script type="text/javascript" >
	var webroot = "${pageContext.request.contextPath}"
</script>