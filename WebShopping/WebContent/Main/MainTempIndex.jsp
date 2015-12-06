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
			<input type="image" src="./Images/black_top_pc.jpg" 	style="width: 100%" />
		</div>
		<div>
			<%@ include file="../Main/MainHeader.jsp"%>
		</div>
	</section>
	<section id="n_section">
		<div>
			<%@ include file="../Main/MainNav.jsp"%>
		</div>
	</section>
	<section id="f_section">
		<div>
			<%@ include file="../Main/MainFooter.jsp"%>
		</div>
	</section>
</body>
</html>