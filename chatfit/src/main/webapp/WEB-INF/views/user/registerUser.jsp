<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="/resources/css/styles.css">
</head>
<header>
</header>
<body>
<div class="main">
<h2>회원가입</h2>
	<form>
		<ul>
		    <li>
		    	아이디
		        <input type="text" id="user_id" name="user_id">
		    </li>
		    <li>
		    	비밀번호
		        <input type="text" placeholder="비밀번호 (10~16자)" id="user_pw" name="user_pw">
		    </li>
		    <li>
		        <input type="text" placeholder="비밀번호 확인" id="user_confirmPw" name="user_confirmPw">
		    </li>
		    <li>
		    	이메일
				<input type="text" id="user_email" name="user_email">	    
		        <button type="button" id="confirmEm" name="confirmEm">이메일 중복 확인</button>
		    </li>
		    <li>
		    	닉네임
		        <input type="text" placeholder="닉네임" id="user_nickname" name="user_nickname">
		        <button type="button" id="confirmNn" name="confirmNn">닉네임 중복 확인</button>
		    </li>
		    <li>
		    	주소
		        <input type="text" placeholder="주소" id="user_address1" name="user_address1">
		        <input type="text" placeholder="상세주소" id="user_address2" name="user_address2">
		        <input type="number" placeholder="우편번호" id="user_zipcode" name="user_zipcode">
		    </li>
		    <li>
		    	<input type="submit" value="회원가입">
		    </li>
    	</ul>
	</form>
</div>
</body>
<footer>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</footer>
</html>