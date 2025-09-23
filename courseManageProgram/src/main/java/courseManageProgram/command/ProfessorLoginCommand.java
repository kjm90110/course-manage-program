package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfessorLoginCommand extends AbstractService{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return "/login/professorLogin.jsp";
	}

}
