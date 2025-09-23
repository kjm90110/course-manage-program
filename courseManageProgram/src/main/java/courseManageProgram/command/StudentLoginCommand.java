package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentLoginCommand extends AbstractService{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return "/login/studentLogin.jsp";
	}

}
