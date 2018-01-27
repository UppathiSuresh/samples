package com.loginapplication;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.PreparedStatement;


public class LoginDao {

	public static boolean validate(String uname, String pass) {
		boolean status = false;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "suresh");
			// "jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "suresh"

			PreparedStatement ps = con.prepareStatement("select * from LOG where uname=? and pass=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			status = rs.next();

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;

	}
}
