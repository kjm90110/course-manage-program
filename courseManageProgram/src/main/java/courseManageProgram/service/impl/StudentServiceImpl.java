package courseManageProgram.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import courseManageProgram.dao.StudentDao;
import courseManageProgram.dao.impl.StudentDaoImpl;
import courseManageProgram.dto.AppliedStudent;
import courseManageProgram.model.Student;
import courseManageProgram.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
	}
	
	@Override
	public List<Student> getAllStudent() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(String sid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addStudent(Student student) throws Exception {
		return studentDao.insertStudent(student);
	}

	@Override
	public int removeStudent(String sid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student loginStudent(String sid, String password) throws Exception {
		return studentDao.loginStudent(sid, password);
	}

	@Override
	public int enrollmentCourse(int courseId, String studentId) throws Exception {
		return studentDao.enrollmentCourse(courseId, studentId);
	}

	@Override
	public String getSid(int courseId) throws Exception {
		return studentDao.selectStdtId(courseId);
	}

	@Override
	public List<Student> getAllStudentForCourseId(int courseId) throws Exception {
		return studentDao.selectAllStudentForCourseId(courseId);
	}

	@Override
	public List<AppliedStudent> getAppliedStudentInfo(int courseId) throws Exception {
		return studentDao.selectListAppliedStudent(courseId);
	}

	@Override
	public void logoutStudent(HttpSession session) throws Exception {
		session.invalidate();
	}

}
