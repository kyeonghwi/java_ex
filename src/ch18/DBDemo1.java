package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo1 {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();

		String sql = "insert into person(name, phone, email) values" + "('김영웅','010-3333-3333','cc@hs.ac.kr')";

		if (stmt.executeUpdate(sql) == 1) {
			System.out.println("insert succeed");
		} else {
			System.out.println("insert fail");
		}
		stmt.close();
		con.close();
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
