package courseManageProgram.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import courseManageProgram.model.Student;

public class StudentLoginProcCommand extends AbstractService {

		@Override
		public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			String id = req.getParameter("studentId");
			String pw = req.getParameter("password");
			
			Student student = null;
			
			// 로그인 처리
			if(id!=null && !id.equals("")
					&& pw!=null && !pw.equals("")) {
				student = studentService.loginStudent(id, pw);
			}
			
			// 로그인 한 객체를 세션에 담음
			if(student!=null) {
				req.getSession().setAttribute("loginStudent", student);
			}
			
			resp.sendRedirect("/studentMain.do");
			
			return "";
			
	}

}
