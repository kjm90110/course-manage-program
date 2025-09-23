package courseManageProgram.dao;

import java.util.List;

import courseManageProgram.dto.AppliedStudent;
import courseManageProgram.model.Student;

public interface StudentDao {

	public abstract List<Student> selectAllStudent() throws Exception;
	public abstract List<Student> selectAllStudentForCourseId(int courseId) throws Exception;
	public abstract Student selectOne(String id) throws Exception;	
	public abstract String selectStdtId(int courseId) throws Exception;
	public abstract int insertStudent(Student stud) throws Exception;
	public abstract int deleteProfessor(String id) throws Exception;
	public abstract Student loginStudent(String sid, String password) throws Exception;
	public abstract int enrollmentCourse(int courseId, String studentId)throws Exception;
	List<AppliedStudent> selectListAppliedStudent(int courseId) throws Exception;
}
