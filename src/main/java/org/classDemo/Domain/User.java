package org.classDemo.Domain;

public class User {
    private int userId;
    private String userName;
    private String password;

    public User(int userId) {
        this.userId = userId;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public User(int userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
