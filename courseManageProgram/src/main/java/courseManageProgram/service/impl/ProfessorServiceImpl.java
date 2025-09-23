package courseManageProgram.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import courseManageProgram.dao.ProfessorDao;
import courseManageProgram.dao.impl.ProfessorDaoImpl;
import courseManageProgram.model.Professor;
import courseManageProgram.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

    public ProfessorDao professorDao;
	
    public ProfessorServiceImpl() {
    	professorDao = new ProfessorDaoImpl();
    }
    
	@Override
	public List<Professor> getAllProfessor() throws Exception {
		return professorDao.selectAllProfessor();
	}

	@Override
	public Professor getProfessor(String id) throws Exception {
		return professorDao.selectOne(id);
	}

	@Override
	public int addProfessor(Professor professor) throws Exception {
		return professorDao.insertProfessor(professor);
	}

	@Override
	public int modifyProfessor(Professor professor) throws Exception {
		return professorDao.updateProfessor(professor);
	}

	@Override
	public int removeProfessor(String id) throws Exception {
		return professorDao.deleteProfessor(id);
	}

	@Override
	public Professor loginProfessor(String pid, String password) throws Exception {
		return professorDao.loginProfessor(pid, password);
	}

	@Override
	public void logoutProfessor(HttpSession session) throws Exception {
		session.invalidate();
	}

	

}
