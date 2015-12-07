<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<section id="h_section">
		<div>
			<%@ include file="/WEB-INF/Main/MainHeader.jsp"%>
		</div>
	</section>
	<section id="n_section">
		<div>
			<iframe width="100%" height="1500" name="mainfr" frameborder="0" scrolling="no"></iframe>
		</div>
	</section>
	<section id="f_section">
		<div>
			<%@ include file="/WEB-INF/Main/MainFooter.jsp"%>
		</div>
	</section>
</body>
</html>