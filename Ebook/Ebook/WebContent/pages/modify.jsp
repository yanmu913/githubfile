<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<form >
		
		<table style="border: 1px solid black;">
		<tr><td colspan="2" style="border: 1px solid black;background-color:lightgreen;" ><h1>更新电子文档</h1></td></tr>
			<tr>
				<td>文档编号</td>
				<td>${param.id}</td>
				<td><input type="hidden" name="id" value="${param.id}"/></td>
			</tr>
			<tr>
				<td>文档名称</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>文档摘要</td>
				<td><textarea name="summmary" /></textarea></td>
			</tr>
			<tr>
				<td>上传人</td>
				<td><input type="text" name="uploader" /></td>
			</tr>
			 <tr>
				<!-- <td>上传时间</td>
				<td><input type="text" name="screateDate" /></td> -->
			</tr> 
			<tr>
				<td><input type="button" value="提交" /></td>
				<td><input type="button" value="返回" /></td>
				
			</tr>
		</table>
		
	</form>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/modify.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/toJump.js"></script> 
<script type="text/javascript">
var webroot = "${pageContext.request.contextPath }"
</script>
