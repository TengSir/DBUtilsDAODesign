package com.oracle.dao.model;

public class User {
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public User(int userid, String username, String password, int age, String nickname) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.age = age;
        this.nickname = nickname;
    }

    private int userid;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public User(String username, String password, int age, String nickname) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String password;
    private int age ;
    private String nickname;
}
