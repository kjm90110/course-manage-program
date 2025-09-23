package courseManageProgram.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.dto.AppliedStudent;

public class CurrentApplicationCommand extends AbstractService{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		int courseId = Integer.parseInt(req.getParameter("courseId"));
		System.out.println("courseId=> "+courseId);
		String courseName = req.getParameter("courseName");
		System.out.println("courseName=> " + courseName); // ?? 왜 null임...
		int std_ct = req.getParameter("curr_std_ct") == null ?
				Integer.parseInt(req.getParameter("curr_std_ct"))
				: Integer.parseInt(req.getParameter("curr_std_ct"));
		System.out.println("std_ct=> "+std_ct);
	
		
		List<AppliedStudent> studentList = studentService.getAppliedStudentInfo(courseId);
		System.out.println(studentList);
		
		req.setAttribute("studentList", studentList);
		req.setAttribute("courseName", courseName);
		req.setAttribute("curr_std_ct", std_ct);
		
		return "/professor/current-application.jsp";
	}

}
