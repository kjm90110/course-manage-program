<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>교수 메인 페이지</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">
</head>
<body class="bg-light">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">교수 전용 시스템</a>
            <div class="d-flex align-items-center ms-auto">
                <button class="btn btn-outline-light me-2" onclick="location.href='/professor/registCourse.do'">강의 등록</button>
                <button class="btn btn-outline-light me-2" id="logoutBtn" onclick="location.href='/professor/logoutProfessor.do'">로그아웃</button>
                <!-- 프로필 아이콘 버튼 -->
                <button class="btn btn-outline-light" onclick="location.href='/professor/professorInfo.do'">
                    <i class="bi bi-person-circle"></i>
                </button>
            </div>
        </div>
    </nav>

    <div class="container mt-5">
        <h3 class="mb-4">강의 일정</h3>

        <!-- 강의 일정 출력/없음 표시 부분 -->
        <c:if test="${empty courseList}">
            <div class="alert alert-warning text-center" role="alert">
                강의 일정이 없습니다!
            </div>
        </c:if>

        <c:if test="${not empty courseList}">
            <table class="table table-bordered text-center align-middle">
                <thead class="table-dark">
                    <tr>
                        <th>강의명 / 과목명</th>
                        <th>강의 시간</th>
                        <th>장소</th>
                        <th>수용 인원</th>
                        <th>현재 신청 인원</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="course" items="${courseList}">
                        <tr>
                            <td><a href="/currentApplication.do?courseId=${course.courseId}&courseName=${course.courseName}&curr_std_ct=${course.curr_std_ct}"
                            >${course.courseName}</a></td>
                            <td>${course.classTime}</td>
                            <td>${course.location}</td>
                            <td>${course.max_student}</td>
                            <td>${course.curr_std_ct}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</body>
</html>
