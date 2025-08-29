package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo3 {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();

//		String sql = "insert into person(name, phone, email) values" + "(?,?,?)";
		String sql = "delete from person where id=?";

		PreparedStatement psmt = con.prepareStatement(sql);

		psmt.setString(1, "9");
		psmt.execute();

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