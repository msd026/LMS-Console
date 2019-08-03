package com.st.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {
	
	private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC";	
	private static final String user = "root";
	private static final String password = "Lampard92!";
	
	private static ConnectionDao conn = null;
	
	ConnectionDao() {
		
	}
	
	public static ConnectionDao getConnection() throws SQLException{
		if (conn == null) {
			Connection conn = DriverManager.getConnection(url, user, password);
				//Connection conn = DriverManager.getConnection(url, user, password);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
						
		}	
		return conn;
	}

}
