package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Professor;

public class ProfessorLoginProcCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String id = req.getParameter("professorId");
		String pw = req.getParameter("professorPassword");
		
		Professor professor = null;
		
		if(id!=null && !id.equals("")
				&& pw!=null && !pw.equals("")) {
			professor = professorService.loginProfessor(id, pw);
		}
		
		if(professor!=null) {
			req.getSession().setAttribute("loginProfessor", professor);
		}
		
		resp.sendRedirect("/professor/professorMain.do");
		
		return "";
	}

}
