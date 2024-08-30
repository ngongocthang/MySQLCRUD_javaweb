package thang.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserImpl {
	public static void select(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM USERS";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String role = rs.getString("role");

				System.out.println("Id" + id + "Email" + email + "Password" + password + "Role" + role);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM USERS WHERE ID = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 11);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void update(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "UPDATE USERS SET email = ?, password = ?, role = ? WHERE id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "admin@gmail.com");
			stmt.setString(2, "123admin");
			stmt.setString(3, "admin");
			stmt.setInt(4, 11);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insert(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO USERS (EMAIL, PASSWORD, ROLE) VALUES(?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "user@gmail.com");
			stmt.setString(2, "123user");
			stmt.setString(3, "user");

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
