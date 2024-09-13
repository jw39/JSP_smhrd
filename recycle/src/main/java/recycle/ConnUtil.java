package recycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnUtil {
	static {
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://project-db-cgi.smhrd.com:3307/campus_24SW_DD_p2_4?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC";
		String id = "campus_24SW_DD_p2_4";
		String password = "smhrd4"; 
		Connection conn = DriverManager.getConnection(url, id, password);
		return conn;
	}

	public static void close(PreparedStatement ps, Connection conn) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(ps, conn);
	}
}
