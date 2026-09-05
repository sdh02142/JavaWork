package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC를 위한 로드, 연결, 닫기
 */

public class DbManager {
	/**
	 * 로드
	 * */
	static {
		try {
			Class.forName(DbProperties.DRIVER_NAME);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				
			}
	}
	
	/**
	 * 연결
	 */
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DbProperties.URL, DbProperties.USER_ID, DbProperties.USER_PASSWORD);
		return con;
	}
	
	/**
	 * 닫기(select가 아닌 경우.)
	 */
	public static void dbClose(Connection con, Statement st/* PreparedStatement는 Statment를 상속받음. */) {
		try {
			if(st!=null) st.close();
			if(con!=null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * 닫기(select인 경우. overload)
	 */
	public static void dbClose(Connection con, Statement st, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			dbClose(con, st);
			} catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
