<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div class="page">
		<div class="top">
			<div>
				卡号：${accountInfo.cardNo} <a
					href="${pageContext.request.contextPath }/logoff"
					onclick="return confirm('确定退出吗?')">退出登录</a>
			</div>
			<div></div>
		</div>

		<div class="middle">
			<div class="left">
				<ul>
					<li><a href="javascript:;">查询余额</a></li>
					<li><a href="javascript:;">转账</a></li>
					<li><a href="javascript:;">查询交易记录</a></li>
					<li><a href="javascript:;">修改密码</a></li>
				</ul>
			</div>

			<div id="main" class="main">
				<div class="welcome">
					<h1>欢迎使用网上个人银行</h1>
				</div>
			</div>
		</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/toJump.js"></script>
<script type="text/javascript" >
	var webroot = "${pageContext.request.contextPath}"
	var cd = "${accountInfo.cardNo}";
</script>