package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Professor;

public class UpdateProfessorInfoProcCommand extends AbstractService {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		// 사용자 입력 수정값
		String pid = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		Professor newProf = null;
		
		int result = professorService.modifyProfessor(new Professor(pid, null, name, email));
		
		System.out.println(result);
		if(result > 0) {
			newProf = professorService.getProfessor(pid);
		}
		
		// 기존 세션값을 수정된 값으로 변경
		req.getSession().setAttribute("loginProfessor", newProf);
		
		resp.sendRedirect("/professor/updateProfessorInfo.jsp?result="+result);
		return "";
		
	}

}
