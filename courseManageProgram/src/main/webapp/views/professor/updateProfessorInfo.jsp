<%@page import="courseManageProgram.model.Professor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>교수 정보 수정</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="bg-light">

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card shadow-sm rounded-3">
					<div class="card-body p-4">
						<h3 class="mb-4 text-center text-primary fw-bold">교수 정보 수정</h3>
						
						<form action="/updateProfessorInfo.do" method="post">
							
							<!-- 아이디 -->
							<div class="mb-3">
								<input
									type="hidden" class="form-control" name="id"
									value="${sessionScope.loginProfessor.id}">
							</div>

							<!-- 이름 -->
							<div class="mb-3">
								<label for="name" class="form-label">이름</label> <input
									type="text" class="form-control" id="name" name="name"
									value="${sessionScope.loginProfessor.pname}" required>
							</div>

							<!-- 이메일 -->
							<div class="mb-3">
								<label for="email" class="form-label">이메일</label> <input
									type="email" class="form-control" id="email" name="email"
									value="${sessionScope.loginProfessor.email}" required>
							</div>

							<!-- 버튼 -->
							<div class="d-flex justify-content-between mt-4">
								<button type="submit" class="btn btn-primary">수정하기</button>
								<a href="professorInfo.do" class="btn btn-secondary">돌아가기</a>
							</div>
						</form>
						
						<c:if test="${result!=null && result>=1}">
							<script>
								alert('수정 성공!');
							</script>
						</c:if>
						
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
