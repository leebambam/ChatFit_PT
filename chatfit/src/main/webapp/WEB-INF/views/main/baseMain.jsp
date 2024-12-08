<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chatfit</title>
<link rel="stylesheet" href="/resources/css/styles.css">
</head>
<header>
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
</header>
<body>
<div class="main">
	<div class="page-main">
		<ul>
			<li><input type="button" onclick="location.href='${pageContext.request.contextPath}/chatfitAi/chatfitAiMain'" value="Chatfit Ai"></li>
			<li><input type="button" onclick="location.href='${pageContext.request.contextPath}/menuAi/menuAiMain'" value="Menu Ai"></li>
			<li><input type="button" onclick="location.href='${pageContext.request.contextPath}/board/boardMain'" value="게시판"></li>
			<li><input type="button" onclick="location.href='${pageContext.request.contextPath}/news/newsMain'" value="뉴스"></li>
			<li><input type="button" onclick="location.href='${pageContext.request.contextPath}/workoutInfo/workoutInfoMain'" value="운동지식"></li>
			<li><input type="button" onclick="location.href='${pageContext.request.contextPath}/workoutGroupBoard/workoutGroupBoardMain'" value="운동모임 게시판"></li>
		</ul>
	</div>
</div>
</body>
<footer>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</footer>
</html>