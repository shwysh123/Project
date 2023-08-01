<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	
}

body {
	width: 100%;
	height: 100%;
	boader: 1px solid black;
}

.wrapper {
	
}

.wrapper>header {
	
}

.wrapper>header>.top--header {
	
}

.wrapper>header>nav {
	
}

.wrapper>main {
	
}

.wrapper>footer {
	
}
</style>
</head>
<body>

	<div class="wrapper">
		<header>
			<div class="top--header">게시물 검색</div>
			<nav></nav>
		</header>
		<main>
			<section>
				<div class=show--block>
					<form action="board/search.do" method="post">
						<input type="text" name="keyfield" placeholder="검색 조건"> <input
							type="text" name="keyword" placeholder="검색어를 입력하세요"> <input
							type="text" name="criteria" placeholder="기준 날짜 (YYYY-MM-DD)">
						<button type="submit">검색</button>
					</form>
					<hr>
					<div>
						<h2>검색 결과</h2>
						<c:if test="${not empty searchResult}">
							<table border="1">
								<tr>
									<th>글 번호</th>
									<th>제목</th>
									<th>작성자</th>
								</tr>
								<c:forEach items="${searchResult}">
									<tr>
										<td>${number}</td>
										<td>${contents}</td>
										<td>${id}</td>
									</tr>
								</c:forEach>
							</table>
						</c:if>
						<c:if test="${not empty searchMessage}">
							<p>${searchMessage}</p>
						</c:if>
					</div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
				</div>



			</section>
			<section></section>
			<section></section>
		</main>
		<footer></footer>
	</div>


</body>
</html>