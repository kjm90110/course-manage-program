package courseManageProgram.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Course;
import courseManageProgram.model.Professor;

public class ProfessorMainCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		Professor prof = (Professor) req.getSession().getAttribute("loginProfessor");

		List<Course> courseList = courseService.getAllCourse(prof.getId());

		System.out.println("courseList: " + courseList);

		req.setAttribute("courseList", courseList);

		return "/professor/professorMain.jsp";
	}

}
