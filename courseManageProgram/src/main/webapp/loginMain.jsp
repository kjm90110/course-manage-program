<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex justify-content-center align-items-center vh-100">
    <div class="container text-center">
        <h3 class="mb-5">교수 / 학생 로그인</h3>
        <div class="d-flex justify-content-center gap-3">
            <a href="/professor/professorLogin.do" class="btn btn-primary btn-lg px-5">Professor Login</a>
            <a href="/student/studentLogin.do" class="btn btn-success btn-lg px-5">Student Login</a>
        </div>
		<a href="/login/chooseRegister.jsp">회원가입</a>
    </div>
</body>
</html>
