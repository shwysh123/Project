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
	overflow: auto;
	max-height: 860px;
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

.scroll::-webkit-scrollbar {
	display: none;
}
</style>
</head>
<body class="scroll">


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
				<th style="background-color: white; height: 450px;"><div
						class="scroll" style="max-height: 450px; overflow: auto;">글내용(사진,글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)</div></th>
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
			</tr>
			<tr class='scroll'
				style="background-color: white; height: 90px; overflow: auto;">
				<td style="display: flex;">
					<div style="position: relative;">mango456</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는
						망고입니다ffaddgdfsgsffas..</div> <!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				<td style="display: flex;">
					<div style="position: relative;">Durumi</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는두루미입니다.fas..</div>
					<!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				<td style="display: flex;">
					<div style="position: relative;">mango456</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는
						망고입니다ffaddgdfsgsffas..</div> <!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				<td style="display: flex;">
					<div style="position: relative;">mango456</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는
						망고입니다ffaddgdfsgsffas..</div> <!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				<td style="display: flex;">
					<div style="position: relative;">mango456</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는
						망고입니다ffaddgdfsgsffas..</div> <!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>



			</tr>


			<tr style="background-color: white;">
				<th>
					<div>
						<textarea class='scroll' placeholder="댓글을 입력하세요."
							style="border: none; resize: none; width: 380px; outline: none;"></textarea>
					</div>
				</th>
			</tr>
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
				<th style="background-color: white; height: 450px;"><div
						class="scroll" style="max-height: 450px; overflow: auto;">글내용(사진,글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)글내용(사진,동영상)</div></th>
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
			</tr>
			<tr class='scroll'
				style="background-color: white; height: 90px; overflow: auto;">
			
				<td style="display: flex;">
					<div style="position: relative;">mango456</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는
						망고입니다ffaddgdfsgsffas..</div> <!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				<td style="display: flex;">
					<div style="position: relative;">Durumi</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는두루미입니다.fas..</div>
					<!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				<td style="display: flex;">
					<div style="position: relative;">mango456</div>
					<div class='scroll'
						style="position: relative; margin-left: 5px; max-width: 190px; max-height: 21px; overflow: auto;">나는
						망고입니다ffaddgdfsgsffas..</div> <!--DB 게시물의 댓글중 빨리적은 순서대로  -->
					<div style="position: relative; margin-left: 10px;">02.02.01
						15:30</div> <!-- nowdate(date)  -->
				</td>
				
			</tr>

			<tr style="background-color: white;">
				<th>
					<div>
						<textarea class='scroll' placeholder="댓글을 입력하세요."
							style="border: none; resize: none; width: 380px; outline: none;"></textarea>
					</div>
				</th>
			</tr>
		</table>
	</div>
</body>
<!--게시판을 구성할 때 글내용을 textarea 안에 입력받고 DB로 보내서 저장하도록 하였는데, 확인해보니 엔터키를 입력한 부분에서 줄바꿈이 되지 않고 그냥 띄어쓰기로 나타나는 문제가 있었다.
실제로 DB안에 데이터에는 엔터가 입력된채로 저장이 되는 데, 이것을 다시 select로 가져올때에 공백으로 인식하는 듯 하였다.
해결방법은 view에서 controller로 data를 넘겨줄 때, 엔터입력한 부분을 html tag인 <br>로 입력을 해주는 것이다.
@RequestMapping(value="/sample/insertBoard")
    public ModelAndView insertBoard(CommandMap commandMap, HttpServletRequest request) throws Exception{
        ModelAndView mv = new ModelAndView("redirect:/sample/openBoardList");
        String contents = ((String)commandMap.get("CONTENTS")).replace("\r\n","<br>");
        commandMap.put("CONTENTS", contents);
        sampleService.insertBoard(commandMap.getMap(),request);
        return mv;
    }

위와 같이 textarea안의 내용을 받아와서 \r\n부분을 모두 <br>tag로 replace 적용해서 DB에 저장을 하면 DB안에 <br>tag가 같이 저장이 된다.



반대로 DB에서 가져올때 <br> 을 개행문자(\r\n) 로 변환하면 된다.  -->
</html>




