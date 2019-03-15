<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>咨询信息</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>编号</th>
				<th>资源来源</th> 
				<th>操作</th>
			</tr>
		</thead>
	<tbody>
	<c:forEach items="${refers}" var="refer">
		<tr>
			<td>${refer.id}</td>
			<td>${refer.source}</td> 
			<td>
				<a href="refer/list.action#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#referEditDialog" onclick="editrefer(${refer.id})">修改</a>
				<a href="refer/list.action#" class="btn btn-danger btn-xs" onclick="deleterefer(${refer.id})">删除</a>
			</td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>