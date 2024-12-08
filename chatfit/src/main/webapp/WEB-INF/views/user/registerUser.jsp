<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<table>
		    <tr>
		        <td><input type="text" placeholder="ID" id="user_id" name="user_id"></td>
		    </tr>
		    <tr>
		        <td><input type="text" placeholder="비밀번호 (10~16자)" id="user_pw" name="user_pw"></td>
		    </tr>
		    <tr>
		        <td><input type="text" placeholder="비밀번호 재입력" id="user_confirmPw" name="user_confirmPw"></td>
		    </tr>
		    <tr>
		        <td><button type="button" id="confirmPw" name="confirmPw">비밀번호 확인</button></td>
		    </tr>
		    <tr>
		        <td><input type="text" placeholder="닉네임" id="user_nickname" name="user_nickname"></td>
		    </tr>
		    <tr>
		    	<td>나이</td>
		        <td><input type="number" id="user_age" name="user_age" step="1"></td>
		    </tr>
		    <tr>
		    	<td>성별</td>
		        <td><input type="radio" value="0" id="user_gender" name="user_gender">남</td>
		        <td><input type="radio" value="1" id="user_gender" name="user_gender">여</td>
		    </tr>
		    <tr>
		    	<td>몸무게</td>
		        <td><input type="number" id="user_weight" name="user_weight" step="0.1"></td>
		    </tr>
		    <tr>
		    	<td>키</td>
		        <td><input type="number" id="user_height" name="user_height" step="0.1"></td>
		    </tr>
		    
		    
    	</table>
	</form>
</div>
</body>
<footer>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</footer>
</html>