package com.trainig.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String dbUser = "sys as SYSDBA";
        String dbPassword = "root";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try (Connection conn = DriverManager.getConnection(url, dbUser, dbPassword)) {

            int newUserId = 1;
            String maxIdQuery = "SELECT MAX(user_id) FROM users";
            try (PreparedStatement ps = conn.prepareStatement(maxIdQuery);
                 ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    newUserId = rs.getInt(1) + 1;
                }
            }

            String insertQuery = "INSERT INTO users(user_id, user_name, password) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setInt(1, newUserId);
                pstmt.setString(2, username);
                pstmt.setString(3, password);

                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("User inserted successfully with user_id: " + newUserId);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}