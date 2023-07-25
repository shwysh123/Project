<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WeSee</title>
<style>
body{width: 1024px; height: 860px; margin: 10px auto; }
h1{text-align:center;
	text-decoration-line:none;
	color: black;
	font-size:40px;
	border-bottom: 5px solid; 
	padding-bottom: 30px;
}
div>button {
	margin-top:150px; margin-left:5px;
	background-color: white; 
}
div>textarea {
 display: flex;
}
</style>
</head>
<body>
<h1>WeSee</h1>
<div>
<label>우리는 함께 바라고 -Wish-</label>
<label>우리는 함께 본다 -WeSee-</label>
</div>

<div style="width: 420px; height: 300px; background-color: black; margin-left:605px; margin-top:200px;">
	<textarea rows="" cols="" placeholder="ID또는 전화번호"></textarea>
	<textarea rows="" cols="" placeholder="비밀번호"></textarea>
	
	<button onclick="맞냐아니냐 따져서 logined.jsp로 이동" style="width: 200px; height: 50px;">로그인</button>
	<button onclick="회원가입 창으로 이동" style="width: 200px; height: 50px;">회원가입</button>
</div>





</body>
</html>