package com.example.jdbcdemo;

public class PreparedStaticDemo {

	public static void main(String[] args) {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/netjs", "root", "admin");
		String sql = conn.createStatement();
	}

}
