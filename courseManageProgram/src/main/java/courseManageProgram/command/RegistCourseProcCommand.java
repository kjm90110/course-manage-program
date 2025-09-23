package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Course;
import courseManageProgram.model.Professor;

public class RegistCourseProcCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		Professor prof = (Professor) req.getSession().getAttribute("loginProfessor");
		
		String courseName = req.getParameter("courseName");
		int maxStudent = Integer.parseInt(req.getParameter("maxStudent"));
		String location = req.getParameter("location");
		String semester = req.getParameter("semester");
		String classTime = req.getParameter("classTime");
		String profId = prof.getId();
		String major = req.getParameter("major");
		
		
		courseService.registCourse(new Course(0, courseName, maxStudent, 0, location,
				semester, classTime, profId, major));
		
		resp.sendRedirect("/professor/professorMain.do");
		
		return "";
	}

}
