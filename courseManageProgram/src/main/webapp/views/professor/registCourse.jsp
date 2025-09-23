<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/css/registCourseForm.css">
<title>교수 전용 시스템 - 강의 등록</title>
</head>
<body>
	<div class="header">
		<h1>교수 전용 시스템</h1>
	</div>

	<div class="container">
		<div class="content-header">
			<h2>강의 등록</h2>
			<a href="/professor/professorMain.do" class="back-btn">목록으로</a>
		</div>

		<div class="form-container">
			<form action="/professor/registCourse.do" method="post"
				onsubmit="return validateForm()">
				<div class="form-group">
					<label for="courseName">강의명 / 과목명 <span class="required">*</span></label>
					<input type="text" id="courseName" name="courseName" required>
				</div>
				<div class="form-group">
					<label for="major">전공<span class="required">*</span></label> <input
						type="text" id="major" name="major" required>
				</div>

				<div class="form-row">
					<div class="form-group">
						<label for="maxStudent">수용 인원 <span class="required">*</span></label>
						<input type="number" id="maxStudent" name="maxStudent" min="1"
							max="200" required>
					</div>
					<div class="form-group">
						<label for="location">강의실 <span class="required">*</span></label>
						<input type="text" id="location" name="location"
							placeholder="예: 공학관 201호" required>
					</div>
				</div>

				<div class="form-row">
					<div class="form-group">
						<label for="semester">교과 구분 <span class="required">*</span></label>
						<select id="semester" name="semester" required>
							<option value="">선택하세요</option>
							<option value="전공필수">전공필수</option>
							<option value="전공선택">전공선택</option>
							<option value="공통교양">공통교양</option>
							<option value="일반교양">일반교양</option>
							<option value="기타">기타</option>
						</select>
					</div>

				</div>

				<div class="form-group">
					<label>강의 시간 <span class="required">*</span></label>
					<div class="form-row">
						<div class="form-group">
							<select name="dayOfWeek" required>
								<option value="">요일 선택</option>
								<option value="월">월요일</option>
								<option value="화">화요일</option>
								<option value="수">수요일</option>
								<option value="목">목요일</option>
								<option value="금">금요일</option>
								<option value="토">토요일</option>
								<option value="일">일요일</option>
							</select>
						</div>
						<div class="form-group">
							<div class="time-inputs">
								<select name="startPeriod" required>
									<option value="">시작교시</option>
									<option value="1">1교시</option>
									<option value="2">2교시</option>
									<option value="3">3교시</option>
									<option value="4">4교시</option>
									<option value="5">5교시</option>
									<option value="6">6교시</option>
									<option value="7">7교시</option>
									<option value="8">8교시</option>
								</select> <span class="time-separator">~</span> <select name="endPeriod"
									required>
									<option value="">종료교시</option>
									<option value="1">1교시</option>
									<option value="2">2교시</option>
									<option value="3">3교시</option>
									<option value="4">4교시</option>
									<option value="5">5교시</option>
									<option value="6">6교시</option>
									<option value="7">7교시</option>
									<option value="8">8교시</option>
								</select>
							</div>
						</div>
					</div>
				</div>

				<div class="button-group">
					<button type="submit" class="submit-btn">강의 등록</button>
					<button type="button" class="cancel-btn" onclick="history.back()">취소</button>
				</div>
			</form>
		</div>
	</div>
<script src="../js/registCourse.js"></script>
</body>
</html>

