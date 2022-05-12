<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<link href="../../../jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="../../../jquery/jquery-1.11.1-min.js"></script>
<script type="text/javascript" src="../../../jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>

</head>
<body>

	<div>
		<div style="position: relative; left: 30px; top: -10px;">
			<div class="page-header">
				<h3>字典类型列表</h3>
			</div>
		</div>
	</div>
	<div class="btn-toolbar" role="toolbar" style="background-color: #F7F7F7; height: 50px; position: relative;left: 30px;">
		<div class="btn-group" style="position: relative; top: 18%;">
		  <button type="button" class="btn btn-primary" onclick="window.location.href='/toAdd'"><span class="glyphicon glyphicon-plus"></span> 创建</button>
		  <button id="toEdit" type="button" class="btn btn-default" onclick="window.location.href='/toEdit'"><span class="glyphicon glyphicon-edit"></span> 编辑</button>
		  <button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span> 删除</button>
		</div>
	</div>
	<div style="position: relative; left: 30px; top: 20px;">
		<table class="table table-hover">
			<thead>
				<tr style="color: #B3B3B3;">
					<th><input type="checkbox" /></th>
					<th>序号</th>
					<th>编码</th>
					<th>名称</th>
					<th>描述</th>
				</tr>
			</thead>
			<tbody>
				<%--<tr class="active">
					<td><input type="checkbox" /></td>
					<td>1</td>
					<td>sex</td>
					<td>性别</td>
					<td>性别包括男和女</td>
				</tr>--%>
				<c:forEach var="data1" items="${requestScope.get('typelist1')}">
					<tr>
						<td><input type="checkbox"/></td>
						<td>序号</td>
						<td>${data1.getCode()}</td>
						<td>${data1.getName()}</td>
						<td>${data1.getDescription()}</td>
						<td>
							<a href="${pageContext.request.contextPath}/toEdit?code=${data.getCode()}">编辑</a>
							|
							<a href="${pageContext.request.contextPath}/type/delete?code=${data.getCode()}">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>