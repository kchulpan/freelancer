<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Login</title>
	
</head>
 
<body>
  
 <div id="wrap">
  <p><img src="/img/mainpage/school4.jpg"/></p>
  
  <div style="text-align:center">
 	 <caption><h2>로그인</h2></caption>
  </div>
  <form action="/SubPage" method="GET">
	  <div class="font">
	   <input type="text" class="userid" id="userid" name="userid" placeholder="아이디 입력"  />  
	  </div>
	  <div class="font">
		<input type="password" class="password" name="password" placeholder="비밀번호 입력" />
	  </div>
 </form>
</div>
</body>
 	 <button class="login" >로그인</button>
  <form action="/Freelancer" method="GET">
  	<button class="login" >프리랜서페이지로 이동</button>
  </form>
  </br>
  <div class="register">
   	<div class="font2">아이디 저장<input type="checkbox"></input></div>
 	<div class="font2"><a href="">아이디찾기</a>/</div>
  	<div class="font2"><a href="">비밀번호 찾기</a></div>
  </div>
</html>