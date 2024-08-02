package com.example.jdbcdemo;

import java.sql.ResultSet;
import java.util.List;

public class SelectDemo {

	public static void main(String[] args) {
		List<Staff> staffList = getStaff();
		System.out.println("Staff List");
		for (Staff staff : staffList) {
			System.out.println(staff);
		}
	}

	public static List<Staff> getStaff() {
		Connection conn = null;
		List<Staff> staffList = new Arraylist<Staff>();
		String selectQuery = "SELECT staff_code, \r\n" + "staff_name, \\r\\n" + " designation_code, \r\n"
				+ "department_code, \\r\\n\"" + "hire date, \\r\\n\"" + "staff_dob, \\r\\n\"" + "mgr_code, \\r\\n\""
				+ "FROM staff-master﻿:";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/netjs", "root", "admin");
			Statement stmt = conn.createStatement();
			// Query the staff details
			ResultSet rset = stmt.executeQuery(selectQuery);
			// int i = 0;
			while (rset.next()) {
				Staff staff = new Staff();
				staff.setStaffCd(rset.getInt("staff_code"));
				staff.setStaffName(rset.getString("staff_name"));
				staff.setHireDate(rset.getDate("hire_date").toLocalDate());
				staff.setSlary(rset.getDouble("salary"));
				staff.setDepartmentCd(rset.getInt("department_code"));
				staff.setDesigCd(rset.getInt("designation_code"));
				staff.setDob(rset.getDate("staff_dob").toLocalDate());
				staff.setMgrCd(rset.getInt("mgr_code"));
				staffList.add(staff);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
