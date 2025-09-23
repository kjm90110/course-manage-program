<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>학생 로그인 - 캠퍼스 시스템</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/student-login.css">
</head>
<body>
    <div class="login-container">
        <div class="login-card">
            <h1 class="title">학생 로그인</h1>
            
            <!-- 에러 메시지 -->
            <c:if test="${not empty errorMessage}">
                <div class="alert alert-danger" role="alert">
                    ${errorMessage}
                </div>
            </c:if>
            
            <!-- 로그아웃 메시지 -->
            <c:if test="${not empty logoutMessage}">
                <div class="alert alert-success" role="alert">
                    ${logoutMessage}
                </div>
            </c:if>
            
            <form action="${pageContext.request.contextPath}/student/studentLogin.do" method="post">
                <div class="form-group">
                    <label for="studentId" class="form-label">아이디</label>
                    <input type="text" class="form-control" id="studentId" name="studentId" 
                           value="${param.studentId}" required>
                </div>
                
                <div class="form-group">
                    <label for="password" class="form-label">비밀번호</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>
                
                <button type="submit" class="btn btn-login">로그인</button>
            </form>
            
            <div class="back-link">
                <a href="${pageContext.request.contextPath}/">← 이전 페이지로 돌아가기</a>
            </div>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>