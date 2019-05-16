<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/stu.css" rel="stylesheet" type="text/css" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
		<form>

			<table>
				<tr>
					<td colspan="2"><h1>修改学员信息</h1></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" name="stuName" /></td>
				</tr>
				<tr>
					<td>性别</td>
					<td>男<input type="radio" name="stuGender" value="男" />女<input
						type="radio" name="stuGender" value="女" /></td>
				</tr>
				<tr>
					<td>生日</td>
					<td><input type="text" name="updateDate" /></td>
				</tr>
				<tr>
					<td>电话</td>
					<td><input type="text" name="stuTelephone" /></td>
				</tr>
				<tr>
					<td>E-mail</td>
					<td><input type="text" name="stuEmail" /></td>
				</tr>
				<tr>
					<td>班级 <select name="classId">
							<option>请选择</option>
							<c:forEach items="${cList}" var="c" varStatus="i">
								<option  value="${c.claId }">${c.claName }</option>
							</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td><input type="button" value="保存" /></td>
					<td><input type="button" value="返回" /></td>
					<td><input type="hidden" name="stuId" value="${param.id}" /></td>
				</tr>
			</table>

		</form>
</body>
</html>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/modify.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/toJump.js"></script>
<script type="text/javascript">
	var webroot = "${pageContext.request.contextPath }"
</script>
