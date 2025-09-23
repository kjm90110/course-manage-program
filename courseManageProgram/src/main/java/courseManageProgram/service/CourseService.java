package courseManageProgram.service;

import java.util.List;

import courseManageProgram.dto.EnrolledCourse;
import courseManageProgram.model.Course;

public interface CourseService {

	public abstract List<Course> getAllCourse(String profId) throws Exception;
	public abstract List<Course> getAllMajorCourse(String sid) throws Exception;
	public abstract List<EnrolledCourse> getAllEnrolledCourse(String sid) throws Exception;
	public abstract Course getCourse(int courseId) throws Exception;
	public abstract int registCourse(Course course) throws Exception;
	public abstract int removeCourse(int courseId) throws Exception;
	public abstract int cancleCourse(int courseId, String sid) throws Exception;
	public abstract int modifyCourseName(Course course) throws Exception;
	public abstract int modifyProfessorId(Course course) throws Exception;
	
}
