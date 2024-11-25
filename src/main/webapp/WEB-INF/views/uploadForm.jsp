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

	<h1> upload form</h1>
	<!-- taglib에서 prefix로 만들어준 form 태그 사용해보기 -->
	<form:form action="upload" method="post" enctype="multipart/form-data" modelAttribute="uploadFile">
		<h3>업로드할 파일 선택</h3>
		파일 : <input type ="file" name="mpfile"><br>
		<p style= "color:red; font-weight:bold;"><form:errors path="mpfile"></form:errors></p><br>
		설명 : <br>
		<textarea rows="10" cols="40" name="desc"></textarea><br>
		<input type ="submit" value="send">
	</form:form>
</body>
</html>