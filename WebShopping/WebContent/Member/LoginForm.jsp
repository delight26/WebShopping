<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
<form action="login.do" method="post">
<input type="text" name="id" placeholder="ID" required/><br/>
<input type="password" name="pass" placeholder="Password" required/>
<input type="submit" value="로그인"/>
</form>
</body>
</html>