package com.javacourse.lessons.les_11.homework.task_3;

public class Task_3 {

    //Есть тсрока заменить точки на запятые
    public static void main(String[] args) {
        String sourceString = "Green.red.blue.yellow";
        String copyString = replaceDotsToComma(sourceString);
        System.out.println("Result: " + copyString);
    }

    public static String replaceDotsToComma(String str) {
        String[] arrayOfWords = str.split("\\.");
        String copyString = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            copyString += arrayOfWords[i];
            if (i != arrayOfWords.length - 1) {
                copyString += ",";
            }
        }
        return copyString;
    }
}
