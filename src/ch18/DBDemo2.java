package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo2 {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();

		String sql = "SELECT * from person";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.print(rs.getString(1) + ", ");
			System.out.print(rs.getString(2) + ", ");
			System.out.print(rs.getString(3) + ", ");
			System.out.println(rs.getString(4));
		}

	}

	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul";

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connecting db");
			con = DriverManager.getConnection(url, "root", "1111");
			System.out.println("db connected");
		} catch (ClassNotFoundException e) {
			System.out.println("cannot find jdbc driver");
		} catch (SQLException e) {
			System.out.println("db connection error");
			System.out.println(e.getMessage());
		}
		return con;

	}
}
