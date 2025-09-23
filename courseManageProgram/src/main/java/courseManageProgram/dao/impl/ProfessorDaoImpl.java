package courseManageProgram.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import courseManageProgram.constant.DBQueryContant;
import courseManageProgram.dao.ProfessorDao;
import courseManageProgram.model.Professor;
import courseManageProgram.util.ConnectionUtil;

public class ProfessorDaoImpl implements ProfessorDao {

	@Override
	public List<Professor> selectAllProfessor() throws Exception {
		String sql = " select * from professor ";
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<Professor> profList = new ArrayList<Professor>();
		while(rs.next()) {
			profList.add(new Professor(rs.getString("id"), rs.getString("password"),
					rs.getString("pname"), rs.getString("email")));
		}
		ConnectionUtil.close(conn, rs, pstmt);
		return profList;
	}

	@Override
	public Professor selectOne(String id) throws Exception {
		String sql = " select * from professor where id=? ";
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		
		Professor prof = null;
		while(rs.next()) {
			prof = new Professor(rs.getString("id"), rs.getString("password"),
					rs.getString("pname"), rs.getString("email"));
		}
		ConnectionUtil.close(conn, rs, pstmt);
		return prof;
	}

	@Override
	public int insertProfessor(Professor prof) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.INSERT_PROFESSOR_QUERY);
		pstmt.setString(1, prof.getId());
		pstmt.setString(2, prof.getPassword());
		pstmt.setString(3, prof.getPname());
		pstmt.setString(4, prof.getEmail());
		
		int result = pstmt.executeUpdate();
		conn.commit();
		ConnectionUtil.close(conn, null, pstmt);
		return result;
	}

	@Override
	public int deleteProfessor(String id) throws Exception {
		return 0;
	}

	
	@Override
	public Professor loginProfessor(String pid, String password) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.LOGIN_PROFESSOR_QUERY);
		pstmt.setString(1, pid);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		
		Professor professor = null;
		while(rs.next()) {
			professor = new Professor(rs.getString("id"), null, rs.getString("pname"), rs.getString("email"));
		}
		
		ConnectionUtil.close(conn, rs, pstmt);
		return professor;
		
	}

	@Override
	public int updateProfessor(Professor professor) throws Exception {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(DBQueryContant.UPDATE_PROFESSOR_QUERY);
		pstmt.setString(1, professor.getPname());
		pstmt.setString(2, professor.getEmail());
		pstmt.setString(3, professor.getId());
		
		int result = pstmt.executeUpdate();
		conn.commit();
		ConnectionUtil.close(conn, null, pstmt);
		return result;
	}

}
