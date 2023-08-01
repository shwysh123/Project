<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
	width: 1024px;
	height: 860px;
	margin: 10px auto;
}
.write {
	width: 500px;
	height: 300px;
	border: 1px solid black;
	overflow: auto; /* 스크롤바가 필요한 경우에만 나타나도록 설정 */
}
</style>
</head>
<body>
	<form action="/board/add.do" method="post">
		<div>
			<textarea name="content" rows="5" cols="40" class="write"></textarea>
		</div>
		<input type="submit" value="글 작성">
	</form>
</body>
</html>