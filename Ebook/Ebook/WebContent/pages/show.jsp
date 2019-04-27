<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>显示全部</title>
</head>
<body>
	<form>
		<table>
		
			<tr>
				<td>图书分类:<select id="category">
						<option value="">全部</option>
						<c:forEach items="${cList}" var="c" varStatus="i">
							<option value="${c.id }"
							
							<c:if test="${ categoryId==c.id}">selected</c:if>
							>${c.name }</option>
						</c:forEach>
				</select>
				</td>
				<td><input type="button" value="查询" /></td>
				<td><input type="button" value="新增" /></td>
			</tr>
		</table>
		<table style="border: 1px solid black;">
		<tr><td colspan="6"><h1 style="text-align: center;">电子图书列表</h1></td></tr>
			<tr style="background-color: lightgray; font-weight: bold;">
				<td style="border: 1px solid black;">图书编号</td>
				<td style="border: 1px solid black;">图书名称</td>
				<td style="border: 1px solid black;">图书概要</td>
				<td style="border: 1px solid black;">上传人</td>
				<td style="border: 1px solid black;">上传时间</td>
				<td style="border: 1px solid black;">操作</td>
			</tr>

			<c:forEach items="${eList}" var="e" varStatus="i">
				<tr <c:if test="${i.index%2!=0 }">style="background-color:lightgreen;"</c:if>
					
				>
					<td style="border: 1px solid black;" class="id">${e.id }</td>
					<td style="border: 1px solid black;">${e.title }</td>
					<td style="border: 1px solid black;">${e.summmary }</td>
					<td style="border: 1px solid black;">${e.uploader }</td>
					<td style="border: 1px solid black;">${e.createDateShow }</td>
					<td style="border: 1px solid black;"><a href="javascript:;" class="modify">修改</a>&nbsp;&nbsp;<a
						href="javascript:;" class="delete">删除</a></td>
				</tr>
			</c:forEach>
			<tr><td><c:if test="${deleteSuccess!=null }">${ deleteSuccess}</c:if>
			<c:remove var="deleteSuccess"/>
			</td>
			<td><c:if test="${updateSuccess!=null }">${ updateSuccess}</c:if>
			<c:remove var="updateSuccess"/>
			</td>
		</table>
		<table >
			<tr id="pageChange">
				<td colspan="3" id="page" >
				<c:choose>
					<c:when test="${pt.currPage==1}"><span>首页</span	> </c:when>
					<c:otherwise><a href="javascript:;" >首页</a> </c:otherwise>
				</c:choose>	
				<c:choose>
					<c:when test="${pt.currPage==1}"><span>上一页</span	> </c:when>
					<c:otherwise><a href="javascript:;" >上一页</a> </c:otherwise>
				</c:choose>	
				<c:choose>
					<c:when test="${pt.currPage==pt.totalPage}"><span>下一页</span> </c:when>
					<c:otherwise><a href="javascript:;" >下一页</a> </c:otherwise>
				</c:choose>	
				<c:choose>
					<c:when test="${pt.currPage==pt.totalPage}"><span>尾页</span> </c:when>
					<c:otherwise><a href="javascript:;" >尾页</a> </c:otherwise>
				</c:choose>	
				</td>	
			</tr>
		</table>

	</form>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/show.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/toJump.js"></script> 
<script type="text/javascript">
var webroot = "${pageContext.request.contextPath }"
var curr =  parseInt("${pt.currPage}");
var count = parseInt("${pt.totalPage}");
</script>