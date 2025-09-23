package courseManageProgram.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.dto.EnrolledCourse;
import courseManageProgram.model.Student;

public class StudentMainCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		Student stud = (Student)req.getSession().getAttribute("loginStudent");
		String sid = stud.getId();
		System.out.println("sid: " + sid);

//		EnrolledCourses
		List<EnrolledCourse> enrolledCourses = courseService.getAllEnrolledCourse(sid);
		System.out.println(enrolledCourses);
		
		req.setAttribute("enrolledCourses", enrolledCourses);
		
		return "/student/studentMain.jsp";
	}

}
