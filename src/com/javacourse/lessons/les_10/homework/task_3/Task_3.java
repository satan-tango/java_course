package com.javacourse.lessons.les_10.homework.task_3;

import java.util.Scanner;

public class Task_3 {

    //В тексте после буквы, например, Р, если она не последняя в слове,
    // ошибочно напечатана буква, например,  А,  вместо, например, О.
    // Внести исправления в текст
    public static void main(String[] args) {
        String sourceString = "file your file with words";
        System.out.println("Source string: " + sourceString);
        Scanner scan = new Scanner(System.in);
        String previousLetter = initData("previous", scan);
        String incorrectLetter = initData("incorrect", scan);
        String correctLatter = initData("correct", scan);
//why do you place editText() in (..)?
        String result = (editText(sourceString, previousLetter, incorrectLetter, correctLatter));
        System.out.println("Result:  " + result);
    }

    public static String initData(String typeOfTheOperation, Scanner scan) {
        boolean isCorrectData = false;
        String letter = "";
        while (!isCorrectData) {
            System.out.print("Enter " + typeOfTheOperation + " letter : ");
            letter = scan.next();
            if (letter.length() != 1) {
                System.out.println("Something went wrong, try again");
                continue;
            }
            isCorrectData = true;
        }
        return letter;
    }

    public static String editText(String sourceString, String prevLetter, String incorrectLetter, String correctLetter) {
        String[] arrayOfWords = sourceString.split(" ");
        String copyString = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            //or use method lastIndexOf()
            if (arrayOfWords[i].charAt(arrayOfWords[i].length() - 1) == prevLetter.charAt(0)) {
                copyString += arrayOfWords[i] + " ";
                continue;
            } else {
                if (arrayOfWords[i].charAt(arrayOfWords[i].length() - 1) == incorrectLetter.charAt(0)) {
                    //replace() method could be used
                    arrayOfWords[i] = arrayOfWords[i].substring(0, arrayOfWords[i].length()-1) + correctLetter;
                }
                copyString += arrayOfWords[i] + " ";
            }

        }
        return copyString;
    }
}
