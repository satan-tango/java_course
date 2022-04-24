package com.javacourse.lessons.les_19.homework.task_1;

public enum Condition {
    INCORRECT_LOGIN_LENGTH("Incorrect login length"),
    INCORRECT_PASSWORD_LENGTH("Incorrect password length"),
    INCORRECT_LOGIN("Incorrect login"),
    LOGIN_IN_USE("The login you have chosen is already taken"),
    INCORRECT_PASSWORD("Incorrect password"),
    REGISTERED("You have been successfully registered"),
    AUTHORIZED("You have been successfully authorized"),
    DOES_NOT_EXIST_LOGIN("There is no account with this login"),
    INVALID_PASSWORD("Invalid password");

    private String description;

    Condition(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
