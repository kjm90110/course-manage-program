package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RequestCommand {

	public abstract String process(HttpServletRequest req, HttpServletResponse resp)
			throws Exception;
	
}
