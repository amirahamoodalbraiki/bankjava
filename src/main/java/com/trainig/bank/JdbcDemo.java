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
			
			
			
			
			
			try(ResultSet rs =pstmt.executeQuery()){
				
			
			//Statement stmt= conn.createStatement() ;
			
			//ResultSet rs=stmt.executeQuery("select * from transaction " 
				//	+ "where trans_amount < 800 or 1=1" );
			
			
					while(rs.next()) {
						System.out.println("Transaction ID: "+rs.getInt("trans_id")
						+ "-" +"Transaction Amount:" +rs.getDouble("trans_amount"));
					}
			}
			
		}
		catch(SQLException e) {
			System.out.println("sql exception");
			e.printStackTrace();
		}
	}

}



//Create a users table in your database with user_id, user_name and password field
// insert values using java code
//then try to login with user_name and password
//if credential matches then show a message "successfully logged in!"
//else show "Incorrect credentials"















