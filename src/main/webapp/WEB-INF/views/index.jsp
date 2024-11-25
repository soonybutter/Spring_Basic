<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>
	
	<h3><a href="restdto">1.selectList</a></h3>
	<h3><a href="restdto/1">2.selectOne</a></h3>
	
	<form action="restdto" method="post">
	ID : <input type="text" name="restid"><br>
	PW : <input type="text" name="restpw"><br>
	Name : <input type="text" name="restname"><br>
	<input type="submit" value="insert">
	</form>
	
	<form action="restdto/2" method="post">
		<input type="hidden" name="_method" value="delete">
		<button>delete</button>
	</form>
	
	<form action="restdto" method="post">
		<input type ="hidden" name="_method" value="put">
		<input type ="hidden" name="restno" value="2">
		변경 할 비밀번호 : <input type ="text" name="restpw"><br>
		<input type="submit" value="update">
	</form>
	
</body>
</html>