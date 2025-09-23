<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>학생 메인 페이지</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css"
	rel="stylesheet">
</head>
<body class="bg-light">

	<!-- 상단 네비게이션 바 -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">학생 전용 시스템</a>
			<div class="d-flex align-items-center ms-auto">
				<button class="btn btn-outline-light me-2"
					onclick="location.href='/enrollmentCourse.do'">수강신청 하러 가기</button>
				<button class="btn btn-outline-light me-2"
					onclick="location.href='/student/logoutStudent.do'">로그아웃</button>
				<!-- 프로필 아이콘 버튼 -->
				<button class="btn btn-outline-light"
					onclick="location.href='/student/studentInfo.jsp'">
					<i class="bi bi-person-circle"></i>
				</button>
			</div>
		</div>
	</nav>

	<!-- 본문 -->
	<div class="container mt-5">
		<h3 class="mb-4">수강 확정 과목 (강의 일정)</h3>

		<!-- 수강 내역 없을 때 -->
		<c:if test="${empty enrolledCourses}">
			<div class="alert alert-warning text-center" role="alert">현재 수강
				확정된 강의가 없습니다.</div>
		</c:if>

		<!-- 수강 내역 있을 때 -->
		<c:if test="${not empty enrolledCourses}">
			<table class="table table-bordered text-center align-middle">
				<thead class="table-dark">
					<tr>
						<th>좌석 번호</th>
						<th>강의명</th>
						<th>담당 교수</th>
						<th>교과구분</th>
						<th>시간</th>
						<th>장소</th>
						<th>수강 취소</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="enrolledCourse" items="${enrolledCourses}">
						<tr>
							<td>${enrolledCourse.seat_no}</td>
							<td>${enrolledCourse.courseName}</td>
							<td>${enrolledCourse.professorName}</td>
							<td>${enrolledCourse.subject_division}</td>
							<td>${enrolledCourse.classTime}</td>
							<td>${enrolledCourse.location}</td>
							<td>
								<form action="/cancleCourse.do" method="post"
									style="display: inline;">
									<input type="hidden" name="courseId"
										value="${enrolledCourse.courseId}">
									<button type="submit" class="btn btn-sm btn-danger">수강
										취소</button>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>

</body>
</html>
