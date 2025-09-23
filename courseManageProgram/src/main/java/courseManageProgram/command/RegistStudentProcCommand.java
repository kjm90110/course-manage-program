package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Student;

public class RegistStudentProcCommand extends AbstractService{

	
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		int grade = Integer.parseInt(req.getParameter("grade"));
		String sname = req.getParameter("sname");
		String major = req.getParameter("major");
		int classNumber = Integer.parseInt(req.getParameter("classNumber"));
		String email = req.getParameter("email");
		
		int result = studentService.addStudent(
				new Student(id, pw, sname, grade, 
						major, classNumber, email
				)); 

		resp.sendRedirect("/student/registStudent.do?status=" + result);
		
		return "";
	}

	
}
