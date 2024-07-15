<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap_5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/fontawesome-free-6.5.2-web/css/all.min.css">
</head>
<body>
	<div class="container w-25">
		<h1>Thêm Dịch Vụ</h1>
		<form action="post" class="form-control ">
			<label for="trangthai" class="form-check-label">Tên Dịch Vụ</label>
			<div class="input-group  pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-user"></i></span> <input type="text" id="trangthai"
					class="form-control" placeholder="Tên Dịch Vụ"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="vitri" class="form-check-label">Đơn Vị Tính</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="vitri"
					class="form-control" placeholder="Đơn Vị Tính"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="vitri" class="form-check-label">Đơn Giá</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="vitri"
					class="form-control" placeholder="Đơn Giá" aria-label="Username"
					aria-describedby="addon-wrapping">
			</div>
			<button class="btn btn-secondary form-control pb-3">Thêm Mới</button>
	</div>
</body>
</html>