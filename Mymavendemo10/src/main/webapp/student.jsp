<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
	<ul>
		<li>您好： ${USER_SESSION.username } </li>
		<li><a href="${pageContext.request.contextPath }/logout">退出</a>
		<li><a href="${pageContext.request.contextPath }/addStudent.jsp">添加学生信息</a>
	</ul>
	<table border="1">
        <tr>
            <th>学生id</th>
            <th>学生名称</th>
            <th>学生年龄</th>
            <th>学生性别</th>
            <th>学生班级</th>
        </tr>
    <c:forEach items="${student}" var="student" >
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.sex}</td>
            <td>${student.classs}</td>
        </tr>
    </c:forEach>


    </table>

</body>
</html>