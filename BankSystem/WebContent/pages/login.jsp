<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>个人银行</h1>
	<div class="login">
	<form >
		<div>卡号：<input type="text" name="account.cardNo"/></div>
		<div>密码：<input type="password" name="account.password"/></div>
		<div><input type="button" value="登录网上银行"/></div>
	</form>
	</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/toJump.js"></script>
<script type="text/javascript" >
	var webroot = "${pageContext.request.contextPath}"
</script>