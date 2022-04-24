package com.javacourse.lessons.les_19.homework.task_1;

import java.util.Map;

public class Authorization {

    private DataBase dataBase;
    private String login;
    private String password;

    public Authorization(DataBase dataBase, String login, String password) {
        this.dataBase = dataBase;
        this.login = login;
        this.password = password;
    }

    private boolean isValidLogin() {
        for (Map.Entry<String, String> entry : dataBase.getDataBase().entrySet()) {
            if (entry.getKey().equals(login)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPassword() {
        for (Map.Entry<String, String> entry : dataBase.getDataBase().entrySet()) {
            if (entry.getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public String isValidData() {
        if (!isValidLogin()) {
            return Condition.DOES_NOT_EXIST_LOGIN.getDescription();
        }
        if (!isValidPassword()) {
            return Condition.INVALID_PASSWORD.getDescription();
        }
        return Condition.AUTHORIZED.getDescription();
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
