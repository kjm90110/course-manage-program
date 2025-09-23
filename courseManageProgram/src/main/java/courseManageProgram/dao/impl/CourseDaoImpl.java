package courseManageProgram.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import courseManageProgram.constant.DBQueryContant;
import courseManageProgram.dao.CourseDao;
import courseManageProgram.dto.EnrolledCourse;
import courseManageProgram.model.Course;
import courseManageProgram.util.ConnectionUtil;

public class CourseDaoImpl implements CourseDao{

	@Override
	public List<Course> selectAllCourse(String pid) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.SELECTLIST_COURSE_QUERY);
		pstmt.setString(1, pid);
		ResultSet rs = pstmt.executeQuery();
		
		List<Course> courseList = new ArrayList<Course>();
		while(rs.next()) {
			courseList.add(new Course(rs.getInt("courseid"), rs.getString("course_name"), rs.getInt("max_student"), 
					rs.getInt("curr_std_ct"), rs.getString("location"), rs.getString("subject_division"), 
					rs.getString("class_time"), rs.getString("professor_id"), rs.getString("major")));
		}
		
		return courseList;
	}

	@Override
	public Course selectOne(int courseId) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.SELECT_ONECOURSE_QUERY);
		pstmt.setInt(1, courseId);
		ResultSet rs = pstmt.executeQuery();
		
		Course course = null;
		while(rs.next()) {
			course = new Course(rs.getInt("courseid"), rs.getString("course_name"), rs.getInt("max_student"), 
					rs.getInt("curr_std_ct"), rs.getString("location"), rs.getString("subject_division"), 
					rs.getString("class_time"), rs.getString("professor_id"), rs.getString("major"));
		}
		
		return course;		
	}

	@Override
	public int insertCourse(Course course) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.INSERT_COURSE_QUERY);
		pstmt.setString(1, course.getCourseName());
		pstmt.setInt(2, course.getMax_student());
		pstmt.setString(3, course.getLocation());
		pstmt.setString(4, course.getSubject_division());
		pstmt.setString(5, course.getClassTime());
		pstmt.setString(6, course.getProfessorId());
		pstmt.setString(7, course.getMajor());
		
		int result = pstmt.executeUpdate();
		conn.commit();
		ConnectionUtil.close(conn, null, pstmt);
		
		return result;
	}

	@Override
	public int deleteCourse(int courseId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCourseName(Course course) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateProfessorId(Course course) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Course> selectAllMajorCourse(String sid) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.SELECTLIST_NOT_APPLICATION_COURSE_QUERY);
		pstmt.setString(1, sid);
		pstmt.setString(2, sid);
		ResultSet rs = pstmt.executeQuery();
		
		List<Course> courseList = new ArrayList<Course>();
		while(rs.next()) {
			courseList.add(new Course(rs.getInt("courseid"), rs.getString("course_name"), rs.getInt("max_student"), 
					rs.getInt("curr_std_ct"), rs.getString("location"), rs.getString("subject_division"), 
					rs.getString("class_time"), rs.getString("professor_id"), rs.getString("major")));
		}
		
		return courseList;
	}

	@Override
	public List<EnrolledCourse> selectAllEnrolledCourse(String sid) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.SELECTLIST_ENROLLED_QUERY);
		pstmt.setString(1, sid);
		ResultSet rs = pstmt.executeQuery();
		
		List<EnrolledCourse> enrolledCourses = new ArrayList<EnrolledCourse>();
		
		while(rs.next()) {
			enrolledCourses.add(new EnrolledCourse(
				rs.getInt("seat_no"), rs.getString("course_name"),
				rs.getString("pname"), rs.getString("subject_division"),
				rs.getString("class_time"), rs.getString("location"),
				rs.getInt("courseid")
			));
		}
		
		return enrolledCourses;
	}

	@Override
	public int cancleCourse(int courseId, String sid) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.CANCLE_COURSE);
		pstmt.setString(1, sid);
		pstmt.setInt(2, courseId);
		
		int result = pstmt.executeUpdate();
		conn.commit();
		ConnectionUtil.close(conn, null, pstmt);
		
		return result;
	}

}
