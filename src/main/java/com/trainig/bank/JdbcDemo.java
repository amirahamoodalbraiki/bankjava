package com.trainig.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username ="sys as SYSDBA";
		String password ="root";
		String query = " select * from transaction where trans_amount < ? and trans_type=?";
		
		try(
		Connection conn = DriverManager.getConnection(url,username,password);
				PreparedStatement pstmt= conn.prepareStatement(query)){
			pstmt.setDouble(1,800);
			pstmt.setString(2,"Deposit");
				ResultSet rs =pstmt.executeQuery();
			//Statement stmt= conn.createStatement() ;
			
			//ResultSet rs=stmt.executeQuery("select * from transaction " 
				//	+ "where trans_amount < 800 or 1=1" );
			
			
					while(rs.next()) {
						System.out.println("Transaction ID: "+rs.getInt("trans_id")
						+ "-" +"Transaction Amount:" +rs.getDouble("trans_amount"));
			}
			
		}
		catch(SQLException e) {
			System.out.println("sql exception");
			e.printStackTrace();
		}
	}

}
