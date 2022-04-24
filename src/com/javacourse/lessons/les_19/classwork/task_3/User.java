package com.javacourse.lessons.les_19.classwork.task_3;

public class User {

    private String login;
    private int password;

    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }
}
