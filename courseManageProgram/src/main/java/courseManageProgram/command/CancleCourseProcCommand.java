package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Student;

public class CancleCourseProcCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		Student loginStud = (Student)req.getSession().getAttribute("loginStudent");
		String sid = loginStud.getId();
		
		int courseId = Integer.parseInt((String) req.getParameter("courseId"));
		
		courseService.cancleCourse(courseId, sid);
		
		resp.sendRedirect("/studentMain.do");
		
		return "";
	}

}
