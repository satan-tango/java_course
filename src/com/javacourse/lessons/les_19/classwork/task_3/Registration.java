package com.javacourse.lessons.les_19.classwork.task_3;

public class Registration {

    private DataBase dataBase;
    private String login;
    private int password;

    public Registration(DataBase dataBase, String login, int password) {
        this.dataBase = dataBase;
        this.login = login;
        this.password = password;
    }

    public boolean isValidLogin() {
        return true;
    }

    public boolean isValidPassword() {
        return true;
    }
}
