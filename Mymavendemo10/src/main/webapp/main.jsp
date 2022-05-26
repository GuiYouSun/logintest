<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页面</title>
</head>
<body>

	<ul>
		<li>您好： ${USER_SESSION.username } </li>
		<li><a href="${pageContext.request.contextPath }/logout">退出</a>
		<li><a href="${pageContext.request.contextPath }/stu">学生信息</a>
	</ul>

</body>
</html>