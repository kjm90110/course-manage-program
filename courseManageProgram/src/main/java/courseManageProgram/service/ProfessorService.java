package courseManageProgram.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import courseManageProgram.model.Professor;

public interface ProfessorService {

	public abstract List<Professor> getAllProfessor() throws Exception;
	public abstract Professor getProfessor(String id) throws Exception;
	public abstract int addProfessor(Professor professor) throws Exception;
	public abstract int modifyProfessor(Professor professor) throws Exception;
	public abstract int removeProfessor(String id) throws Exception;
	public abstract Professor loginProfessor(String pid, String password) throws Exception;
	public abstract void logoutProfessor(HttpSession session) throws Exception;
	
}
