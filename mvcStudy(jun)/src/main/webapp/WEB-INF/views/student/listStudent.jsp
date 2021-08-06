<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="student" items="${students }">
		${student.seq }<br>
		${student.id }<br>
		${student.name }<br>
		${student.phone }<br>
		<hr>
	</c:forEach>
</body>
</html>