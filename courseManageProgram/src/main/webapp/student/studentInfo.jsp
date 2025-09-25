<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>학생 정보</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
    /* input 박스 focus 시 outline, shadow 제거 */
    .form-control:focus {
        outline: none !important;
        box-shadow: none !important;
        border-color: #ced4da; /* 원래 테두리 색으로 유지 */
    }
</style>
</head>
<body class="bg-light">
	<div class="container mt-5">
		<h3 class="mb-4">학생 정보</h3>
		<form action="/professor/modifyStudent.do"
			class="border rounded p-4 bg-white shadow-sm">
			<div class="mb-3">
				<label for="id" class="form-label">아이디</label> <input type="text"
					class="form-control" id="id"
					value="${sessionScope.loginStudent.id}" readonly>
			</div>
			<div class="mb-3">
				<label for="pname" class="form-label">이름</label> <input type="text"
					class="form-control" id="pname"
					value="${sessionScope.loginStudent.sname}" readonly>
			</div>
			<div class="mb-3">
				<label for="grade" class="form-label">학년</label> <input
					type="text" class="form-control" id="grade"
					value="${sessionScope.loginStudent.grade}" readonly>
			</div>
			<div class="mb-3">
				<label for="major" class="form-label">전공</label> <input
					type="text" class="form-control" id="major"
					value="${sessionScope.loginStudent.major}" readonly>
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">학번</label> <input
					type="text" class="form-control" id="email"
					value="${sessionScope.loginStudent.classNumber}" readonly>
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">이메일</label> <input
					type="email" class="form-control" id="email"
					value="${sessionScope.loginStudent.email}" readonly>
			</div>
			<button type="submit" class="btn btn-primary">수정하기</button>
			<a href="/student/studentMain.do" class="btn btn-secondary">뒤로가기</a>
		</form>
	</div>
</body>
</html>
