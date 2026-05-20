package com.training;


//Enapsulation 
public class User {

    // Attributes
	// instance variables
    private String userId;
    private String userName;
    private String userEmail;

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
        return userEmail;
    }

    // Setter for useEmail
    public void setUseEmail(String useEmail) {
        this.userEmail = useEmail;
    }
}