<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login" method="post">
	
		<div>${msg }</div>
		用户名：<input type="text" name="username">
		密    码：<input type="password" name="password">
		<input type="submit" value="登录">
	</form>

</body>
</html>