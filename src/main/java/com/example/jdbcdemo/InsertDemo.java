package com.example.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		String query = "INSERT into staff_master " + "(staff_name,  designation_code, department_code, hire_date,"
				+ "staff dob, mgr_code, salary)" + "values('Venkat', 4, 1, '2018-07-15', '1990-11-05, 4, 58000.00)";

		// Load driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection
		try {
			// Get Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/netjs", "root", "admin");

			Statement s = conn.createStatement();

			// Execute query
			int rowsaffected = s.executeUpdate(query);

			if (rowsaffected == 1) {
				System.out.println("Record inserted succesfully");
			} else {
				System.out.println("Problem while inserting Record");
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
