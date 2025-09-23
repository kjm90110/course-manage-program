package courseManageProgram.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import courseManageProgram.constant.DBQueryContant;
import courseManageProgram.dao.StudentDao;
import courseManageProgram.model.Student;
import courseManageProgram.dto.AppliedStudent;
import courseManageProgram.util.ConnectionUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> selectAllStudent() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectOne(String id) throws Exception {
		return null;

	}

	@Override
	public int insertStudent(Student stud) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.INSERT_STUDENT_QUERY);
		pstmt.setString(1, stud.getId());
		pstmt.setString(2, stud.getPassword());
		pstmt.setString(3, stud.getSname());
		pstmt.setInt(4, stud.getGrade());
		pstmt.setString(5, stud.getMajor());
		pstmt.setInt(6, stud.getClassNumber());
		pstmt.setString(7, stud.getEmail());

		int result = pstmt.executeUpdate();
		conn.commit();
		ConnectionUtil.close(conn, null, pstmt);

		return result;
	}

	@Override
	public int deleteProfessor(String id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student loginStudent(String sid, String password) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.LOGIN_STUDENT_QUERY);
		pstmt.setString(1, sid);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();

		Student student = null;
		while (rs.next()) {
			student = new Student(rs.getString("id"), null, rs.getString("sname"), rs.getInt("grade"),
					rs.getString("major"), rs.getInt("class_number"), rs.getString("email"));
		}

		ConnectionUtil.close(conn, rs, pstmt);
		return student;

	}

	@Override
	public int enrollmentCourse(int courseId, String studentId) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.INSERT_ENROLLMENT_QUERY);
		pstmt.setString(1, studentId);
		pstmt.setInt(2, courseId);
		pstmt.setInt(3, courseId);

		int result = pstmt.executeUpdate();
		conn.commit();
		ConnectionUtil.close(conn, null, pstmt);

		return result;
	}

	@Override
	public List<Student> selectAllStudentForCourseId(int courseId) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.SELECT_ALLSTUDENT_FOR_COURSE_ID);
		pstmt.setInt(1, courseId);
		ResultSet rs = pstmt.executeQuery();

		List<Student> list = new ArrayList<Student>();
		while (rs.next()) {
			list.add(new Student(rs.getString("id"), null, rs.getString("sname"), rs.getInt("grade"), null,
					rs.getInt("class_number"), rs.getString("email")));
		}
		ConnectionUtil.close(conn, rs, pstmt);
		return list;
	}

	@Override
	public List<AppliedStudent> selectListAppliedStudent(int courseId) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.SELECTLIST_APPLIED_STUDENT);
		
		pstmt.setInt(1, courseId);
		ResultSet rs = pstmt.executeQuery();
		
		List<AppliedStudent> resultList = new ArrayList<AppliedStudent>();
		while(rs.next()) {
			resultList.add(new AppliedStudent(
					rs.getInt("class_number"),
					rs.getString("sname"),
					rs.getString("major"),
					rs.getInt("grade"),
					rs.getInt("seat_no")
				));
		}
		return resultList;
	}

	@Override
	public String selectStdtId(int courseId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
