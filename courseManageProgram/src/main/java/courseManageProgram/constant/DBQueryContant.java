package courseManageProgram.constant;

public class DBQueryContant {

	
	
	// Professor
	public static String INSERT_PROFESSOR_QUERY 
	= " insert into professor (id, password, pname, email) "
			+ "values(?, ?, ?, ?) ";

	public static String LOGIN_PROFESSOR_QUERY
	= " select * from professor where id=? and password=? ";
	
	public static String UPDATE_PROFESSOR_QUERY
	= " UPDATE PROFESSOR SET PNAME=?, EMAIL=? WHERE ID=? ";
	
	public static String SELECT_PROFESSOR_NAME
	= " select pname from professor where id=? ";
	
	
	// Course
	
	// 강의 등록(교수)
	public static String INSERT_COURSE_QUERY
	= " insert into course (courseid, course_name,"
			+ "max_student, curr_std_ct, location, subject_division,"
			+ "class_time, professor_id, major)"
			+ " values(seq_course.nextval, "
			+ "?, ?, 0, ?,"
			+ "?, ?, ?,"
			+ "?) ";
	
	public static String SELECT_ONECOURSE_QUERY
	= " SELECT * FROM COURSE WHERE COURSEID=? ";
	
	// 교수가 연 강의들을 가져오는 쿼리
	public static String SELECTLIST_COURSE_QUERY
	= " select * from course where professor_id=? ";
	
	// 강의가 오픈되었으나 학생이 아직 신청하지 않은 강의들의 리스트
	// ##전공이 같아야 가져옴##
	public static String SELECTLIST_NOT_APPLICATION_COURSE_QUERY
	= "SELECT c.COURSEID, c.COURSE_NAME, c.MAX_STUDENT, "
	           + "c.CURR_STD_CT, c.LOCATION, c.SUBJECT_DIVISION, c.CLASS_TIME, "
	           + "c.PROFESSOR_ID, c.MAJOR "
	           + "FROM COURSE c "
	           + "WHERE NOT EXISTS ( "
	           + "SELECT 1 "
	           + " FROM COURSE_ENROLLMENT ce "
	           + "WHERE ce.COURSE_ID = c.COURSEID "
	           + "AND ce.STUDENT_ID = ?"
	           + ")"
	           + " AND C.MAJOR = ("
	           + "	SELECT MAJOR"
	           + "	FROM STUDENT"
	           + "	WHERE ID=?"
	           + ") ";  

	// 학생이 신청한 강의들만 가져오는 쿼리
	public static String SELECTLIST_ENROLLED_QUERY
	= " SELECT ce.SEAT_NO, c.COURSE_NAME, p.PNAME, c.SUBJECT_DIVISION, "
			+ "c.CLASS_TIME, c.LOCATION, c.courseid"
			+ " FROM course c, COURSE_ENROLLMENT ce, PROFESSOR p"
			+ " WHERE c.courseid = ce.course_id"
			+ "	AND c.PROFESSOR_ID = p.ID"
			+ "	AND ce.STUDENT_ID = ? ";
	
	
	/*
	 * " SELECT ce.SEAT_NO, c.COURSE_NAME, p.PNAME, c.SUBJECT_DIVISION,"
			+ "	c.CLASS_TIME, c.LOCATION"
			+ "	FROM course c, COURSE_ENROLLMENT ce, PROFESSOR p"
			+ "	WHERE c.courseid = ce.course_id"
			+ " and p.id = ce.professor_id
			+ "	AND	P.ID = ? ";
	 * */
	
	
	// Student
	
	public static String SELECTONE_STUDENT_QUERY
	= " select * from student where id=? ";
	
	public static String SELECTLIST_APPLIED_STUDENT
	= " SELECT S.CLASS_NUMBER, S.SNAME, S.MAJOR, "
			+ "S.GRADE, CE.SEAT_NO "
			+ "FROM STUDENT S, COURSE_ENROLLMENT CE "
			+ "WHERE S.ID = CE.STUDENT_ID "
			+ "AND CE.COURSE_ID=? "
			+ "ORDER BY CE.SEAT_NO ";
	
	public static String INSERT_STUDENT_QUERY
	= " insert into student (id, password, sname, grade,"
			+ "major, class_number, email)"
			+ " values(?, ?, ?,"
			+ " ?, ?, ?, ?) ";
	
	
	public static String LOGIN_STUDENT_QUERY
	= " select * from student where id=? and password=? ";
	
	
	// COURSE_ENROLLMENT
	public static String INSERT_ENROLLMENT_QUERY
	= " INSERT INTO COURSE_ENROLLMENT VALUES (seq_enrollment.NEXTVAL, ?, ?,"
			+ " NVL((SELECT MAX(seat_no) + 1"
			+ " FROM course_enrollment"
			+ " WHERE course_id = ?), 1)"
			+ ") ";
	
	
	public static String SELECT_ALLSTUDENT_FOR_COURSE_ID
	= " select * from course_enrollment where course_id=? ";
	
	public static String CANCLE_COURSE
	= " delete course_enrollment where student_id=? and course_id=? ";
	
}
