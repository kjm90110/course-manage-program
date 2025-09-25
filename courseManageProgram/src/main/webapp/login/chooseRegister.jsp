<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입 선택</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<%=request.getContextPath()%>/css/chooseRegister.css" rel="stylesheet">
</head>
<body>
    <div class="register-choice-container">
        <div class="form-title">회원가입 선택</div>
        <p class="text-center text-muted mb-4">회원가입 유형을 선택하세요</p>
        <div class="d-grid gap-3">
            <a href="<%=request.getContextPath()%>/professor/registProfessor.jsp" class="btn btn-primary btn-lg">교수로 회원가입</a>
            <a href="<%=request.getContextPath()%>/student/registStudent.jsp" class="btn btn-success btn-lg">학생으로 회원가입</a>
        </div>
        <a href="<%=request.getContextPath()%>/login/loginMain.jsp" class="back-link">← 로그인 페이지로 돌아가기</a>
    </div>
</body>
</html>
