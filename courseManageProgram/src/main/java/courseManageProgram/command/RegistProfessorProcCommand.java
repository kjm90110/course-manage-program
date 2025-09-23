package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Professor;

public class RegistProfessorProcCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		String pname = req.getParameter("pname");
		String email = req.getParameter("email");
		
		int result = professorService.addProfessor(new Professor(id, pw, pname, email));
		resp.sendRedirect("/professor/registProfessor.do?status=" + result);
		
		return "";
	}

	
}
