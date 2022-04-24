package com.javacourse.lessons.les_19.homework.task_1;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

    private String login;
    private String password;
    private DataBase dataBase;

    public Registration(String login, String password, DataBase dataBase) {
        this.login = login;
        this.password = password;
        this.dataBase = dataBase;
    }

    private int isCorrectLogin() {
        if (login.length() < 5 || login.length() > 15) {
            return 0;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(login);
        if (!matcher.matches()) {
            return -1;
        }
        return 1;
    }

    private int isCorrectPassword() {
        if (password.length() < 5 || password.length() > 12) {
            return 0;
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            return -1;
        }
        return 1;
    }

    private boolean doesLoginInUse() {
        for (Map.Entry<String, String> entry : dataBase.getDataBase().entrySet()) {
            if (login.equals(entry.getKey())) {
                return true;
            }
        }
        return false;
    }


    public String isCorrectInputData() {
        switch (isCorrectLogin()) {
            case 0:
                return Condition.INCORRECT_LOGIN_LENGTH.getDescription();
            case -1:
                return Condition.INCORRECT_LOGIN.getDescription();
        }
        switch (isCorrectPassword()) {
            case 0:
                return Condition.INCORRECT_PASSWORD_LENGTH.getDescription();
            case -1:
                return Condition.INCORRECT_PASSWORD.getDescription();
        }
        if (doesLoginInUse()) {
            return Condition.LOGIN_IN_USE.getDescription();
        } else {
            return Condition.REGISTERED.getDescription();
        }
    }
}
