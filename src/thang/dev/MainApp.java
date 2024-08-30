package thang.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import thang.dev.data.CategoryImpl;
import thang.dev.data.OrderImpl;
import thang.dev.data.OrderItemImpl;
import thang.dev.data.ProductImpl;
import thang.dev.data.UserImpl;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		CategoryImpl.insert(conn);
		CategoryImpl.update(conn);
		CategoryImpl.delete(conn);
		CategoryImpl.select(conn);
		
		ProductImpl.insert(conn);
		ProductImpl.update(conn);
		ProductImpl.delete(conn);
		ProductImpl.select(conn);
		
		UserImpl.insert(conn);
		UserImpl.update(conn);
		UserImpl.delete(conn);
		UserImpl.select(conn);
		
		OrderImpl.insert(conn);
		OrderImpl.update(conn);
		OrderImpl.delete(conn);
		OrderImpl.select(conn);
		
		OrderItemImpl.insert(conn);
		OrderItemImpl.update(conn);
		OrderItemImpl.delete(conn);
		OrderItemImpl.select(conn);

	}

	private static Connection getConnection() {
		final String DB_URL = "jdbc:mysql://localhost:3306/jsweb";
		final String USER = "root";
		final String PASS = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
