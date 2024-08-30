package thang.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryImpl {
	public static void select(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CATEGORIES";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String thumbnail = rs.getString("thumbnail");

				System.out.println("Id" + id + "Name" + name + "Thumbnail" + thumbnail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM CATEGORIES WHERE ID = ?";
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
		String sql = "UPDATE CATEGORIES SET name = ?, thumbnail = ? WHERE id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao Nu");
			stmt.setString(2, "http://thumbnail_update.png");
			stmt.setInt(3, 11);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insert(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CATEGORIES (NAME, THUMBNAIL) VALUES(?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao Nam");
			stmt.setString(2, "http://thumbnail.png");

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
