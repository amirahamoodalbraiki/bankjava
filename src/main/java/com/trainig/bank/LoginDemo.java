package com.trainig.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginDemo {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String dbUser = "sys as SYSDBA";
        String dbPassword = "root";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String query =
                "SELECT * FROM users WHERE user_name = ? AND password = ?";

        try (
                Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
                PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {

                if (rs.next()) {
                    System.out.println("Successfully logged in!");
                } else {
                    System.out.println("Incorrect credentials");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}