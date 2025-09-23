package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistProfessorCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setAttribute("status", req.getParameter("status"));
		return "/professor/registProfessor.jsp";
	}

}
