<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

a {
	text-decoration-line: none;
	color: black;
	font-size: 50px;
}

table {
	border: 1px solid;
}

table>tr>th {
	border: 1px solid;
}
</style>
</head>
<body>
	<h1>
		<a href="/WeSee/">WeSee</a>
	</h1>
	<div>
		<button style="border: none; background-color: white;">
			<img src="Resource/Bell.png">
		</button>
		<button style="border: none; background-color: white;">
			<img src="Resource/Search.png">
		</button>
		<button style="border: none; background-color: white;">
			<img src="Resource/Pencil.png">
		</button>
		<button style="border: none; background-color: white;">
			<img src="Resource/Message.png">
		</button>
		<button style="border: none; background-color: white;">
			<img src="Resource/Person.png">
		</button>
	</div>
	<div
		style="display: flex; justify-content: space-evenly; margin-top: 30px;">
		<table style="width: 400px; height: 650px; background-color: black;">
			<tr style="width: 400px; height: 20px;">
				<th style="display: flex; color: white;">
					<div>
						<label>mango123</label>
					</div>
					<div style="margin-left: 170px;">
						<label>2023-07-27(15:30)</label>
					</div>
				</th>
				<!-- 글쓴 시간이 빠를수록 위쪽으로 배치  -->
			</tr>
			<tr>
				<th style="background-color: white; height: 450px;"><div>글내용(사진,동영상)</div></th>
			</tr>
			<tr>
				<th style="display: flex; height: 28px; background-color: white;">
					<div>
						<button style="border: 0px; background-color: white;">
							<img src="Resource/Good.png">
						</button>
					</div>
					<div>좋아요</div>
					<div>3.5k</div> <!-- 자동숫자올라감. 1000이 넘어가면1.0k로 변경 소수점 둘째짜리 삭제 가능?-->
					<div style="margin-left: 150px;">
						<label>조회수</label>
					</div>
					<div style="margin-left: 20px;">66</div> <!--  자동숫자올라감.1000이 넘어가면 1.0k로 변경..소수점 둘째짜리 삭제 가능?? -->
				</th>
			<tr style="background-color: white;verrical-align: top; ">
				<th style="height: 131px;">댓글
				<textarea placeholder="댓글을 입력하세요."
						style="border: none; resize: none; width: 380px; "></textarea>
						</th>
		</table>
		<table style="width: 400px; height: 650px; background-color: black;">
			<tr style="width: 400px; height: 20px;">
				<th style="display: flex; color: white;">
					<div>
						<label>mango123</label>
					</div>
					<div style="margin-left: 170px;">
						<label>2023-07-27(15:30)</label>
					</div>
				</th>
				<!-- 글쓴 시간이 빠를수록 위쪽으로 배치  -->
			</tr>
			<tr>
				<th style="background-color: white; height: 450px;"><div>글내용(사진,동영상)</div></th>
			</tr>
			<tr>
				<th style="display: flex; height: 28px; background-color: white;">
					<div>
						<button style="border: 0px; background-color: white;">
							<img src="Resource/Good.png">
						</button>
					</div>
					<div>좋아요</div>
					<div>3.5k</div> <!-- 자동숫자올라감. 1000이 넘어가면1.0k로 변경 소수점 둘째짜리 삭제 가능?-->
					<div style="margin-left: 150px;">
						<label>조회수</label>
					</div>
					<div style="margin-left: 20px;">66</div> <!--  자동숫자올라감.1000이 넘어가면 1.0k로 변경..소수점 둘째짜리 삭제 가능?? -->
				</th>
			<tr style="background-color: white;">
				<th style="height: 131px;">댓글<textarea>댓글입력란</textarea></th>
		</table>
	</div>
</body>
</html>