package courseManageProgram.dao;

import java.util.List;

import courseManageProgram.dto.EnrolledCourse;
import courseManageProgram.model.Course;

public interface CourseDao {
	public abstract List<Course> selectAllCourse(String pid) throws Exception;
	public abstract List<Course> selectAllMajorCourse(String sid) throws Exception;
	public abstract List<EnrolledCourse> selectAllEnrolledCourse(String sid) throws Exception;
	public abstract Course selectOne(int courseId) throws Exception;
	public abstract int insertCourse(Course course) throws Exception;
	public abstract int deleteCourse(int courseId) throws Exception;
	public abstract int cancleCourse(int courseId, String sid) throws Exception;
	public abstract int updateCourseName(Course course) throws Exception;
	public abstract int updateProfessorId(Course course) throws Exception;
}
