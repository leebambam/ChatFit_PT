<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
<h2 class="align-center">Chatfit</h2>
<div class="align-right">
	<input type="button" onclick="location.href='${pageContext.request.contextPath}/user/registerUser'" id="goRegister" value="회원가입">
	<input type="button" onclick="location.href='${pageContext.request.contextPath}/user/loginUser'" id="goLogin" value="로그인">
	<input type="button" onclick="location.href='${pageContext.request.contextPath}/main/baseMain'" id="goMain" value="홈으로">
</div>
</header>