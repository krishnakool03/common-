package com.org.citi.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseConnecction {

	public static String GetLocatorName(String localReference) throws ClassNotFoundException, SQLException   {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databaseschema","root","");
		String sql = "select * from testdata" + " where locatorreference ='" + localReference + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String locator=rs.getString(2);
			System.out.println(locator);
			
		}
		con.close();
		return sql;
		

	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GetLocatorName("password");
	}
}
