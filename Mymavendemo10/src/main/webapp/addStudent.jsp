<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生信息</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/add" method="post"  >
	

		学生姓名：<input type="text" name="name"><br><br>
		学生年龄：<input type="text" name="age"><br><br>
		学生性别：<input type="text" name="sex"><br><br>
		学生班级：<input type="text" name="classs"><br><br>
		<input type="submit" value="添加">
	</form>

</body>
</html>