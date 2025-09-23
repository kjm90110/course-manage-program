package courseManageProgram.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Course;
import courseManageProgram.model.Student;

public class EnrollmentCourseCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		Student student = (Student)req.getSession().getAttribute("loginStudent");
		String sid = student.getId();
		
		// 학생의 전공 강의들 중 신청하지 않은 강의들만 있는 리스트
		List<Course> openCourses = courseService.getAllMajorCourse(sid);
		System.out.println("openCourses: " + openCourses);
		req.setAttribute("courseList", openCourses);

		String status = req.getParameter("status");
		if(status != null && status.equals("")) {
			req.setAttribute("status", status);
		}
		
		return "/student/enrollmentCourse.jsp";
	}

	
}
