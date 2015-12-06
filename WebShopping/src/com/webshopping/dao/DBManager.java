package com.webshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManager {
	private static Connection conn;
	
	private DBManager() {
	}

	public static Connection getConnection() {
		
		try {
		Context initContext = new InitialContext();
		
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		
		DataSource ds = (DataSource) envContext.lookup("jdbc/membersDBPool");
		
		conn = ds.getConnection();
		
		} catch(NamingException e) {
			e.printStackTrace();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				pstmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("close(conn,pstmt,rs)");
		}

	}

	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("close(conn,pstmt)");
		}

	}
}

