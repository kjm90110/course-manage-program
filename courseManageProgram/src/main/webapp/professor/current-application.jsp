<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>현재 신청 인원</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="bg-light">
	<!-- 상단 네비게이션 -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/professor/professorMain.do">교수 전용
				시스템</a>
		</div>
	</nav>

	<div class="container mt-5">
		<h3 class="mb-4">
			[${courseName}] 현재 신청 인원: <span class="text-primary fw-bold">${curr_std_ct}</span>
			명
		</h3>

		<!-- 신청 학생이 없을 때 -->
		<c:if test="${empty studentList}">
			<div class="alert alert-warning text-center" role="alert">현재
				신청한 학생이 없습니다.</div>
		</c:if>

		<!-- 신청 학생이 있을 때 -->
		<c:if test="${not empty studentList}">
			<table
				class="table table-striped table-hover text-center align-middle">
				<thead class="table-dark">
					<tr>
						<th>학번</th>
						<th>이름</th>
						<th>전공</th>
						<th>학년</th>
						<th>좌석 번호</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${studentList}">
						<tr>
							<td>${student.class_number}</td>
							<td>${student.sname}</td>
							<td>${student.major}</td>
							<td>${student.grade}</td>
							<td>${student.seat_no}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>
