package courseManageProgram.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import courseManageProgram.command.RequestCommand;

public class clientRequestController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String requestURI = req.getRequestURI();
		String requestMethod = req.getMethod();
		String command = null;

		if (requestURI != null && requestURI.length() > 0 && requestURI.endsWith(".do")) {
			command = requestURI.substring(requestURI.lastIndexOf('/') + 1, requestURI.indexOf(".do"));
		}

		String proc = requestMethod.equalsIgnoreCase("POST") ? "Proc" : "";
		String className = "courseManageProgram.command." + command.substring(0, 1).toUpperCase() + command.substring(1)
				+ proc + "Command";

		System.out.println("포워딩 할 클래스 이름: " + className);

		try {
			Class commandClass = Class.forName(className);
			RequestCommand obj = (RequestCommand) commandClass.newInstance();
			String viewName = obj.process(req, resp);
			System.out.println("viewName: " + viewName);

			if (viewName != null && !viewName.equals("") && !viewName.equals("nofr")) {

				RequestDispatcher dispatcher = req.getRequestDispatcher(viewName);
				dispatcher.forward(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
