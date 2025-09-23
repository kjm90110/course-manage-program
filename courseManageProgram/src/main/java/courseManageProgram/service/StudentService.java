package courseManageProgram.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import courseManageProgram.dto.AppliedStudent;
import courseManageProgram.model.Student;

public interface StudentService {

	public abstract List<Student> getAllStudent() throws Exception;
	public abstract Student getStudent(String sid) throws Exception;
	public abstract List<Student> getAllStudentForCourseId(int courseId) throws Exception;
	public abstract List<AppliedStudent> getAppliedStudentInfo(int courseId) throws Exception;
	public abstract String getSid(int courseId) throws Exception;
	public abstract int addStudent(Student student) throws Exception;
	public abstract int removeStudent(String sid) throws Exception;
	public abstract Student loginStudent(String sid, String password) throws Exception;
	public abstract int enrollmentCourse(int courseId, String studentId) throws Exception;
	public abstract void logoutStudent(HttpSession session) throws Exception;
}
