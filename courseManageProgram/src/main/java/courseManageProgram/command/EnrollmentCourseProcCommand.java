package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Student;

public class EnrollmentCourseProcCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		Student stud = (Student)req.getSession().getAttribute("loginStudent");
		String sid = stud.getId();
		
		System.out.println("courseId: " + req.getParameter("courseId"));
		
		int courseId = req.getParameter("courseId")==null ? 0 : Integer.parseInt(req.getParameter("courseId"));
		
		// 수강신청
		int result = studentService.enrollmentCourse(courseId, sid);
		resp.sendRedirect("/student/enrollmentCourse.do?status=" + result);
		
		return "";
	}

}
