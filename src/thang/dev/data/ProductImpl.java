package thang.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ProductImpl {
	public static void select(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM PRODUCTS";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String thumbnail = rs.getString("thumbnail");
				String description = rs.getString("description");
				Double price = rs.getDouble("price");
				int quantity = rs.getInt("quantity");
				int view = rs.getInt("view");
				int category_id = rs.getInt("category_id");
				Timestamp created_at = rs.getTimestamp("created_at");

				System.out.println("Id" + id + "Name" + name + "Thumbnail" + thumbnail + "Description" + description
						+ "Price" + price + "Quantity" + quantity + "View" + view + "Category_id"
						+ category_id + "Created_at" + created_at);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM PRODUCTS WHERE ID = ?";
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
		String sql = "UPDATE PRODUCTS SET name = ?, thumbnail = ?, description = ?, price = ?, quantity = ?, view = ?, category_id = ?, WHERE id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao Nu");
			stmt.setString(2, "http://thumbnail_update.png");
			stmt.setString(3, "Ao Nu");
			stmt.setDouble(4, 120);
			stmt.setInt(5, 1);
			stmt.setInt(6, 1);
			stmt.setInt(7, 1);
			stmt.setInt(8, 11);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insert(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO PRODUCTS (NAME, THUMBNAIL, DESCRIPTION, PRICE, QUANTITY, VIEW, CATEGORY_ID) VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao Nam");
			stmt.setString(2, "http://thumbnail.png");
			stmt.setString(3, "Ao Nam");
			stmt.setDouble(4, 123);
			stmt.setInt(5, 1);
			stmt.setInt(6, 1);
			stmt.setInt(7, 1);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
