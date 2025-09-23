package courseManageProgram.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import courseManageProgram.constant.JDBCConstant;

public class ConnectionUtil {

	public static Connection getConnection() throws Exception {
		Class.forName(JDBCConstant.JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(
				JDBCConstant.JDBC_URL,
				JDBCConstant.USER,
				JDBCConstant.PASSWORD
		);
		conn.setAutoCommit(false);
		return conn;
	} // getConnection
	
	public static void close(Connection conn, ResultSet rs, Statement stmt) throws Exception {
		if(conn!=null) conn.close();
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
	} // close
	
}
