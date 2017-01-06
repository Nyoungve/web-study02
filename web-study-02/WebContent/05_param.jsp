<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>서블릿</title>
<!-- 로그인 유효성 검사하는 자바스크립트 파일을 추가해준다.-->
<!-- 자바스크립트 함수가 추가되도록  onclick 이벤트를 기술해야한다. 표객체로 접근할 수 있도록 form name을 기술해야 한다.-->
<script type="text/javascript" src="param.js"></script>
</head>
<body>
<form method="get" action="ParamServlet" name="frm">
	아이디 : <input type="text" name="id"><br>
	나 &nbsp; 이: <input type="text" name="age"><br>
	<input type="submit" value="전송" onclick="return check()">
</form>
</body>
</html>