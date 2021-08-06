<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생 정보 등록</h1>
	<form:form method="post" action="/student/addStudent" commandName="student">
		<table>
			<tr>
				<td>
					<form:label path="id">id</form:label>
				</td>
				<td>
					<form:input  path="id"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="name">name</form:label>
				</td>
				<td>
					<form:input  path="name"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="phone">phone</form:label>
				</td>
				<td>
					<form:input  path="phone"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="저장">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>