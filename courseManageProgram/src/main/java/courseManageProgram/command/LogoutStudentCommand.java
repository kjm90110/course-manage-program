package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutStudentCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		studentService.logoutStudent(req.getSession());
		return "/";
	}
	
}
