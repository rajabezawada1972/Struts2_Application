package com.raja.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.raja.controller.User;

public class DbUtils {

	public static List<User> FetchData() {
		ResultSet rs = null;
		User user = null;
		ArrayList<User> list = null;

		try {
			
			list = new ArrayList<User>();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raja", "root", "raja");
			String query1 = "select *from employee_db";
			System.out.println("query ::" + query1);
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query1);
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				list.add(user);
			}

			return list;

			// return rs;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
