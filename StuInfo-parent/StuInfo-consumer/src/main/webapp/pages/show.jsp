<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/stu.css" rel="stylesheet" type="text/css" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>显示全部</title>
</head>
<body>
	<form>
		<table style="border: 1px solid black;">
		<tr><td colspan="6"><h1 class="title">学员信息列表</h1></td></tr>
			<tr class="stitle">
				<td style="border: 1px solid black;">	编号</td>
				<td style="border: 1px solid black;">姓名</td>
				<td style="border: 1px solid black;">性别</td>
				<td style="border: 1px solid black;">生日</td>
				<td style="border: 1px solid black;">电话</td>
				<td style="border: 1px solid black;">E-mail</td>
				<td style="border: 1px solid black;">班级</td>
			</tr>

			<c:forEach items="${sList}" var="s" varStatus="i">
				<tr <c:if test="${i.index%2==0 }">style="background-color:lightgreen;"</c:if>
					
				>
					<td style="border: 1px solid black;" class="id"><a href="javascript:;"class="modify">${s.stuId }</a></td>
					<td style="border: 1px solid black;">${s.stuName }</td>
					<td style="border: 1px solid black;">${s.stuGender }</td>
					<td style="border: 1px solid black;">
						<fmt:formatDate value="${s.stuBirthday }" pattern="yyyy-MM-dd"/>
					</td>
					<td style="border: 1px solid black;">${s.stuTelephone }</td>
					<td style="border: 1px solid black;">${s.stuEmail }</td>
					<td style="border: 1px solid black;">${s.classes.claName }</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/show.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/toJump.js"></script> 
<script type="text/javascript">
var webroot = "${pageContext.request.contextPath }"
</script>