package com.training;

// Encapsulation
public class User {

    // instance variables
    private String userId;
    private String userName;
    private String useEmail;

    // static variable
    public static String organizationName;

    // constructor
    public User(String userId, String userName, String useEmail) {
        this.userId = userId;
        this.userName = userName;
        this.useEmail = useEmail;
    }

    // Getter for userId
    public String getUserId() {
        return userId;
    }

    // Setter for userId
    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Getter for userName
    public String getUserName() {
        return userName;
    }

    // Setter for userName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter for useEmail
    public String getUseEmail() {
        return useEmail;
    }

    // Setter for useEmail
    public void setUseEmail(String useEmail) {
        this.useEmail = useEmail;
    }
}