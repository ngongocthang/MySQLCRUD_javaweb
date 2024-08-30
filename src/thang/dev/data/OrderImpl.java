package thang.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderImpl {
	public static void select(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ORDERS";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String code = rs.getString("code");
				String status = rs.getString("status");
				String user_id = rs.getString("user_id");
				String created_at = rs.getString("created_at");

				System.out.println("Id" + id + "Code" + code + "Status" + status + "User_id" + user_id + "Created_at" + created_at);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM ORDERS WHERE ID = ?";
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
		String sql = "UPDATE ORDERS SET code = ?, status = ?, user_id = ? WHERE id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "giamgia");
			stmt.setString(2, "paid");
			stmt.setInt(3, 1);
			stmt.setInt(4, 11);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insert(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO ORDERS (CODE, STATUS, USER_ID) VALUES(?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao Nu");
			stmt.setString(2, "canceled");
			stmt.setInt(1, 1);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
