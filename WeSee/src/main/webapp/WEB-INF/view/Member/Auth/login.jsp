<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WeSee</title>
<style>
body {
	width: 1024px;
	height: 860px;
	margin: 10px auto;
}

h1 {
	text-align: center;
	text-decoration-line: none;
	color: black;
	font-size: 50px;
	border-bottom: 5px solid;
	padding-bottom: 30px;
}

.bigbox {
	display: flex;
	justify-content: space-evenly;
	margin-top: 30%;
}

.box {
	display: flex;
	flex-direction: column; /*수직정렬*/
	justify-content: space-evenly;
	flex-grow: 2;
	border-radius: 5%;
}

div>input {
	display: flex;
	font-size: 30px;
	width: 420px;
	height: 40px;
	margin-left: 30px;
}

a {
	width: 200px;
	height: 50px;
	
}

a.ex1 {
	display: inline-block;
	line-height: 50px;
	text-align: center;
	
}

.ex2 {
	display: flex;
	justify-content: space-evenly;
}

.wesee {
	margin-top: 50px;
	flex-grow: 1;
}

label {
	font-size: 50px;
	font-weight: bold;
	text-align: center;
}
</style>
</head>
<body>

	<h1><label>WeSee</label></h1>

	<div class="bigbox">
		<div class="wesee">
			<label>우리는 바라고 -Wish-<br>우리는 본다. -WeSee-
			</label>
		</div>

		<div class="box"
			style="width: 420px; height: 280px; background-color: black; padding-top: 10px; text-align: center;">
			<input type="text" placeholder="아이디또는 휴대폰번호" /> <input
				type="password" placeholder="비밀번호" />
			<div class="ex2">
					<a href=<c:url value="/login.do" /> class="ex1"
						style="text-decoration: none; color: black;"><button
							style="width: 200px; height: 50px; background-color: white;">로그인</button></a>

				
				<a href=<c:url value="/join.do" /> class="ex1"
						style="text-decoration: none; color: black;"><button
							style="width: 200px; height: 50px; background-color: white;">회원가입</button></a>

			</div>
		</div>
	</div>




</body>
</html>