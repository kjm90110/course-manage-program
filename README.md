# Course Management Program 📚

대학교 수강신청 관리 시스템을 위한 웹 애플리케이션입니다. 교수와 학생이 강의 등록, 수강신청, 강의 관리 등을 수행할 수 있는 종합적인 시스템을 제공합니다.

## 📋 프로젝트 개요

이 프로젝트는 대학교의 수강신청 시스템을 모델링한 웹 애플리케이션으로, 교수와 학생 두 가지 사용자 역할을 지원합니다. MVC 패턴과 Command 패턴을 기반으로 설계되었으며, JSP와 Servlet을 활용한 전통적인 Java 웹 애플리케이션입니다.

## 🖥️ 시스템 스크린샷

### 로그인 시스템
시스템 접속 시 사용자는 교수 또는 학생 로그인 방식을 선택할 수 있습니다.

![로그인 방식 선택 페이지](screenshots/login_choice.png)
*로그인 방식 선택 화면 - 교수와 학생 중 선택*

## 🏗️ 시스템 아키텍처

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Presentation  │    │    Business     │    │   Data Access   │
│     Layer       │    │     Logic       │    │     Layer       │
│                 │    │     Layer       │    │                 │
│ JSP + Servlet   │◄──►│   Service       │◄──►│      DAO        │
│ (View/Control)  │    │  (Command)      │    │  (Database)     │
└─────────────────┘    └─────────────────┘    └─────────────────┘
```

### 패턴 적용
- **MVC Pattern**: Model-View-Controller 구조
- **Command Pattern**: 요청별 Command 클래스로 처리
- **DAO Pattern**: 데이터베이스 접근 추상화
- **Singleton Pattern**: ConnectionUtil에서 활용

## 🛠️ 기술 스택

- **Backend**: Java, JSP, Servlet
- **Database**: Oracle Database
- **Frontend**: JSP, Bootstrap 5, HTML5, CSS3, JavaScript
- **Server**: Apache Tomcat
- **Architecture**: MVC, Command Pattern, DAO Pattern

## 📁 프로젝트 구조

```
courseManageProgram/
├── src/main/java/courseManageProgram/
│   ├── command/           # Command 패턴 구현
│   ├── constant/          # 상수 정의
│   ├── controller/        # 메인 컨트롤러
│   ├── dao/              # 데이터 접근 객체
│   │   └── impl/         # DAO 구현체
│   ├── dto/              # 데이터 전송 객체
│   ├── filter/           # 서블릿 필터
│   ├── model/            # 도메인 모델
│   ├── service/          # 비즈니스 로직
│   │   └── impl/         # Service 구현체
│   └── util/             # 유틸리티 클래스
└── src/main/webapp/
    ├── views/            # JSP 뷰 페이지
    │   ├── login/        # 로그인 관련
    │   ├── professor/    # 교수 기능
    │   └── student/      # 학생 기능
    ├── css/              # 스타일시트
    ├── js/               # JavaScript 파일
    └── WEB-INF/          # 웹 애플리케이션 설정
```

## 👥 사용자 역할 및 주요 기능

### 🎓 교수 (Professor)

#### 로그인 및 메인 화면
교수는 전용 로그인 페이지를 통해 시스템에 접속할 수 있습니다.

![교수 로그인 페이지](screenshots/professorLogin.png)
*교수 로그인 화면*

로그인 후 교수 전용 메인 페이지에서 강의 관리 기능을 이용할 수 있습니다.

![교수 메인 페이지](screenshots/professor_main.png)
*교수 메인 화면 - 강의 관리 및 현황 조회*

#### 주요 기능
- **회원가입/로그인**: 교수 계정 생성 및 인증
- **강의 등록**: 새로운 강의 개설
- **강의 관리**: 개설한 강의 목록 조회
- **수강생 조회**: 강의별 신청한 학생 목록 확인
- **정보 수정**: 개인정보 업데이트

#### 강의 등록 시스템
교수는 강의명, 수강정원, 강의실, 시간 등을 설정하여 새로운 강의를 개설할 수 있습니다.

![강의 등록 페이지](screenshots/registCourse.png)
*강의 등록 화면 - 강의 정보 입력 및 등록*

### 🎒 학생 (Student)

#### 로그인 및 메인 화면
학생은 학번과 비밀번호로 시스템에 로그인할 수 있습니다.

![학생 로그인 페이지](screenshots/studentLogin.png)
*학생 로그인 화면*

로그인 후 학생 메인 페이지에서 수강신청 및 현황을 확인할 수 있습니다.

![학생 메인 페이지](screenshots/studentMain.png)
*학생 메인 화면 - 수강신청 및 현황 관리*

#### 주요 기능
- **회원가입/로그인**: 학생 계정 생성 및 인증
- **수강신청**: 개설된 강의 중 전공 맞는 강의 신청
- **수강현황 조회**: 신청한 강의 목록 확인
- **수강 취소**: 신청한 강의 취소
- **정보 조회**: 개인정보 확인

#### 학생 정보 관리
학생은 개인정보를 조회하고 관리할 수 있습니다.

![학생 정보 페이지](screenshots/studentInfo.png)
*학생 정보 화면 - 개인정보 조회 및 관리*

#### 수강신청 시스템
학생은 개설된 강의 목록을 확인하고 전공에 맞는 강의를 신청할 수 있습니다.

![수강신청 페이지](screenshots/enrollment.png)
*수강신청 화면 - 강의 목록 조회 및 신청*

## 🗃️ 데이터베이스 스키마

### 주요 테이블

#### PROFESSOR (교수)
```sql
- ID VARCHAR2(20) PRIMARY KEY
- PASSWORD VARCHAR2(100)
- PNAME VARCHAR2(50)
- EMAIL VARCHAR2(100)
```

#### STUDENT (학생)
```sql
- ID VARCHAR2(20) PRIMARY KEY
- PASSWORD VARCHAR2(100)
- SNAME VARCHAR2(50)
- GRADE NUMBER
- MAJOR VARCHAR2(50)
- CLASS_NUMBER NUMBER
- EMAIL VARCHAR2(100)
```

#### COURSE (강의)
```sql
- COURSEID NUMBER PRIMARY KEY
- COURSE_NAME VARCHAR2(100)
- MAX_STUDENT NUMBER
- CURR_STD_CT NUMBER DEFAULT 0
- LOCATION VARCHAR2(50)
- SUBJECT_DIVISION VARCHAR2(20)
- CLASS_TIME VARCHAR2(50)
- PROFESSOR_ID VARCHAR2(20)
- MAJOR VARCHAR2(50)
```

#### COURSE_ENROLLMENT (수강신청)
```sql
- ENROLLMENT_ID NUMBER PRIMARY KEY
- STUDENT_ID VARCHAR2(20)
- COURSE_ID NUMBER
- SEAT_NO NUMBER
```

### 데이터베이스 설정
1. Oracle Database 설치 및 실행
2. `UNIVERSITY` 스키마 생성
3. `src/main/java/courseManageProgram/constant/JDBCConstant.java`에서 DB 정보 수정:
```java
public static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
public static final String USER = "UNIVERSITY";
public static final String PASSWORD = "UNIVERSITY";
```

### 테이블 생성
필요한 테이블 및 시퀀스 생성:
```sql
-- 교수 테이블
CREATE TABLE PROFESSOR (
    ID VARCHAR2(20) PRIMARY KEY,
    PASSWORD VARCHAR2(100) NOT NULL,
    PNAME VARCHAR2(50) NOT NULL,
    EMAIL VARCHAR2(100)
);

-- 학생 테이블
CREATE TABLE STUDENT (
    ID VARCHAR2(20) PRIMARY KEY,
    PASSWORD VARCHAR2(100) NOT NULL,
    SNAME VARCHAR2(50) NOT NULL,
    GRADE NUMBER NOT NULL,
    MAJOR VARCHAR2(50) NOT NULL,
    CLASS_NUMBER NUMBER NOT NULL,
    EMAIL VARCHAR2(100)
);

-- 강의 테이블
CREATE TABLE COURSE (
    COURSEID NUMBER PRIMARY KEY,
    COURSE_NAME VARCHAR2(100) NOT NULL,
    MAX_STUDENT NUMBER NOT NULL,
    CURR_STD_CT NUMBER DEFAULT 0,
    LOCATION VARCHAR2(50) NOT NULL,
    SUBJECT_DIVISION VARCHAR2(20) NOT NULL,
    CLASS_TIME VARCHAR2(50) NOT NULL,
    PROFESSOR_ID VARCHAR2(20) NOT NULL,
    MAJOR VARCHAR2(50) NOT NULL,
    FOREIGN KEY (PROFESSOR_ID) REFERENCES PROFESSOR(ID)
);

-- 수강신청 테이블
CREATE TABLE COURSE_ENROLLMENT (
    ENROLLMENT_ID NUMBER PRIMARY KEY,
    STUDENT_ID VARCHAR2(20) NOT NULL,
    COURSE_ID NUMBER NOT NULL,
    SEAT_NO NUMBER NOT NULL,
    FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID),
    FOREIGN KEY (COURSE_ID) REFERENCES COURSE(COURSEID)
);

-- 시퀀스 생성
CREATE SEQUENCE SEQ_COURSE START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_ENROLLMENT START WITH 1 INCREMENT BY 1;
```

## 🚀 설치 및 실행

### 애플리케이션 실행
1. 프로젝트를 IDE에서 Import
2. Tomcat 서버 설정
3. Oracle JDBC 드라이버 추가 (lib 폴더에 ojdbc.jar)
4. 프로젝트를 Tomcat에 배포 및 실행
5. 브라우저에서 `http://localhost:8080/courseManageProgram/` 접속

## 🔧 주요 기능

### Command Pattern 구현
각 요청을 별도의 Command 클래스로 처리:
- `StudentLoginCommand`: 학생 로그인 페이지
- `StudentLoginProcCommand`: 학생 로그인 처리
- `EnrollmentCourseCommand`: 수강신청 페이지
- `ProfessorMainCommand`: 교수 메인 페이지
- 등등...

### 동적 라우팅
`clientRequestController`에서 요청 URL을 분석하여 적절한 Command 실행:
```java
String command = requestURI.substring(requestURI.lastIndexOf('/') + 1, requestURI.indexOf(".do"));
String proc = requestMethod.equalsIgnoreCase("POST") ? "Proc" : "";
String className = "courseManageProgram.command." + command + proc + "Command";
```

### 세션 관리
- 로그인한 사용자 정보를 세션에 저장
- 각 페이지에서 세션을 통한 사용자 인증
- 로그아웃 시 세션 무효화

### 데이터 유효성 검증
- 수강신청 시 전공 일치 확인
- 강의 정원 초과 방지
- 중복 수강신청 방지

## 🌐 주요 URL 매핑

### 공통
- `/`: 메인 로그인 페이지
- `/login/chooseRegister.jsp`: 회원가입 유형 선택

### 교수
- `/professor/professorLogin.do`: 교수 로그인
- `/professor/professorMain.do`: 교수 메인페이지
- `/professor/registCourse.do`: 강의 등록
- `/professor/registProfessor.do`: 교수 회원가입
- `/currentApplication.do`: 수강신청 현황

### 학생
- `/student/studentLogin.do`: 학생 로그인
- `/student/studentMain.do`: 학생 메인페이지
- `/enrollmentCourse.do`: 수강신청
- `/student/registStudent.do`: 학생 회원가입
- `/cancleCourse.do`: 수강취소

---

**Note**: 이 프로젝트는 교육 목적으로 제작되었으며, 실제 운영 환경에서 사용하기 전에 보안 강화 및 성능 최적화가 필요합니다.
