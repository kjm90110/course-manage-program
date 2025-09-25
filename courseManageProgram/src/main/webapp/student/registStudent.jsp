<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 회원가입</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="<%=request.getContextPath()%>/css/registStudent.css"
	rel="stylesheet">
</head>
<body>
	<div class="register-container">
		<div class="form-title">학생 회원가입</div>
		<form action="registStudent.do" method="post">

			<div class="mb-3">
				<label for="id" class="form-label">아이디</label> <input type="text"
					class="form-control" id="id" name="id" required>
			</div>

			<div class="mb-3">
				<label for="password" class="form-label">비밀번호</label> <input
					type="password" class="form-control" id="password" name="password"
					required>
			</div>

			<div class="mb-3">
				<label for="sname" class="form-label">이름</label> <input type="text"
					class="form-control" id="sname" name="sname" required>
			</div>

			<div class="mb-3">
				<label for="grade" class="form-label">학년</label> <select
					name="grade" required>
					<option value="">선택하세요</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
				</select>
			</div>

			<div class="mb-3">
				<label for="major" class="form-label">전공</label> <input
				type="text" class="form-control" id="major" name="major">
			</div>

			<div class="mb-3">
				<label for="classNumber" class="form-label">학번</label> <input
					type="text" class="form-control" id="classNumber"
					name="classNumber">
			</div>

			<div class="mb-3">
				<label for="email" class="form-label">이메일</label> <input
					type="email" class="form-control" id="email" name="email">
			</div>

			<button type="submit"
				class="btn btn-primary">회원가입</button>
		</form>
		<a href="<%=request.getContextPath()%>/login/loginMain.jsp"
			class="back-link">← 로그인 페이지로 이동</a>
	</div>

	<c:if test="${status!=null}">
		<c:choose>
			<c:when test="${status>=1}">
				<script type="text/javascript">
					alert('회원가입 성공');
					if(document.getElementsByClassName("register-container")) {
						window.location.assign("/");
					}
				</script>
			</c:when>
			<c:otherwise>
				<script type="text/javascript">
					alert('회원가입 실패. 다시 시도 부탁');
				</script>
			</c:otherwise>
		</c:choose>
	</c:if>

</body>
</html>
s
