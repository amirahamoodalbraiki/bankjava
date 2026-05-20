package com.training;

public class UserClient {

    public static void main(String[] args) {

        User user1 = new User();

        user1.setUserId("A101");
        user1.setUserName("Haitham");
        user1.setUseEmail("abc@gmail.com");

        System.out.println("userID: " + user1.getUserId() +
                           "\nuserName: " + user1.getUserName());
    }
}