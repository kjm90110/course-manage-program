package courseManageProgram.dao;

import java.util.List;

import courseManageProgram.model.Professor;

public interface ProfessorDao {

	public abstract List<Professor> selectAllProfessor() throws Exception;
	public abstract Professor selectOne(String id) throws Exception;	
	public abstract int insertProfessor(Professor prof) throws Exception;
	public abstract int updateProfessor(Professor professor) throws Exception;
	public abstract int deleteProfessor(String id) throws Exception;
	public abstract Professor loginProfessor(String pid, String password) throws Exception;
}
