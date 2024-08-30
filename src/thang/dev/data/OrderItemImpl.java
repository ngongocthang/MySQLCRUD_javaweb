package thang.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemImpl {
	public static void select(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ORDER_ITEMS";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				int quantity = rs.getInt("quantity");
				Double price = rs.getDouble("price");
				int order_id = rs.getInt("order_id");
				int product_id = rs.getInt("product_id");

				System.out.println("Id" + id + "Quantity" + quantity + "Price" + price+ "Order_id" + order_id+ "Product_id" + product_id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM ORDER_ITEMS WHERE ID = ?";
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
		String sql = "UPDATE ORDER_ITEMS SET quantity = ?, price = ?, order_id = ?, product_id = ? WHERE id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 6);
			stmt.setDouble(2, 202);
			stmt.setInt(3, 2);
			stmt.setInt(4, 3);
			stmt.setInt(5, 11);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insert(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO ORDER_ITEMS (QUANTITY, PRICE, ORDER_ID, PRODUCT_ID) VALUES(?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 5);
			stmt.setDouble(2, 123);
			stmt.setInt(3, 1);
			stmt.setInt(4, 1);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
