<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>수강 신청 페이지</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css"
	rel="stylesheet">
</head>
<body class="bg-light">
	<!-- 상단 네비게이션 -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">학생 전용 시스템</a>
			<div class="d-flex align-items-center ms-auto">
				<button class="btn btn-outline-light"
					onclick="location.href='/student/studentInfo.do'">
					<i class="bi bi-person-circle"></i>
				</button>
			</div>
		</div>
	</nav>

	<div class="container mt-5">
		<h3 class="mb-4">열린 강의</h3>

		<!-- 강의 없을 때 -->
		<c:if test="${empty courseList}">
			<div class="alert alert-warning text-center" role="alert">현재 신청
				가능한 강의가 없습니다!</div>
		</c:if>

		<!-- 강의 있을 때 -->
		<c:if test="${not empty courseList}">
			<table class="table table-bordered text-center align-middle">
				<thead class="table-dark">
					<tr>
						<th>강의 번호</th>
						<th>강의명</th>
						<th>담당 교수</th>
						<th>교과구분</th>
						<th>시간</th>
						<th>장소</th>
						<th>수용 인원</th>
						<th>현재 신청 인원</th>
						<th>신청</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="course" items="${courseList}">
						<tr>
							<td>${course.courseId}</td>
							<td>${course.courseName}</td>
							<td>${course.professorId}</td>
							<td>${course.subject_division}</td>
							<td>${course.classTime}</td>
							<td>${course.location}</td>
							<td>${course.max_student}</td>
							<td>${course.curr_std_ct}</td>
							<td>
								<form action="/student/enrollmentCourse.do" method="post"
									class="m-0">
									<input type="hidden" name="courseId" value="${course.courseId}">
									<button type="submit" class="btn btn-outline-primary btn-sm"
										onclick="return confirm('신청 하시겠습니까?')">신청하기</button>
								</form> 
								
								<c:if test="${status != null}">
									<c:choose>
									<c:when test="${status != null && status >= 1}">
										<script>
											alert('신청 성공!');
										</script>
									</c:when>
									<c:otherwise>
										<script>
											alert('오류.');
										</script>
									</c:otherwise>
								</c:choose>
								</c:if>

							</td>
						</tr>
					</c:forEach>
					
					<button class="btn btn-outline-primary btn-sm" 
					onclick="location.href='/student/studentMain.do'">홈으로</button>
					
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>
