package courseManageProgram.service.impl;

import java.util.List;

import courseManageProgram.dao.CourseDao;
import courseManageProgram.dao.impl.CourseDaoImpl;
import courseManageProgram.dto.EnrolledCourse;
import courseManageProgram.model.Course;
import courseManageProgram.service.CourseService;

public class CourseServiceImpl implements CourseService {

  	public CourseDao courseDao;
  	
  	public CourseServiceImpl() {
  		courseDao = new CourseDaoImpl();
  	}
	
	@Override
	public List<Course> getAllCourse(String profId) throws Exception {
		return courseDao.selectAllCourse(profId);
	}

	@Override
	public Course getCourse(int courseId) throws Exception {
		return courseDao.selectOne(courseId);
	}

	@Override
	public int registCourse(Course course) throws Exception {
		return courseDao.insertCourse(course);
	}

	@Override
	public int removeCourse(int courseId) throws Exception {
		return courseDao.deleteCourse(courseId);
	}

	@Override
	public int modifyCourseName(Course course) throws Exception {
		return courseDao.updateCourseName(course);
	}

	@Override
	public int modifyProfessorId(Course course) throws Exception {
		return courseDao.updateProfessorId(course);
	}

	@Override
	public List<Course> getAllMajorCourse(String sid) throws Exception {
		return courseDao.selectAllMajorCourse(sid);
	}

	@Override
	public List<EnrolledCourse> getAllEnrolledCourse(String sid) throws Exception {
		return courseDao.selectAllEnrolledCourse(sid);
	}

	@Override
	public int cancleCourse(int courseId, String sid) throws Exception {
		return courseDao.cancleCourse(courseId, sid);
	}

}
