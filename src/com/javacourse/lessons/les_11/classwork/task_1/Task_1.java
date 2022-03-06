package com.javacourse.lessons.les_11.classwork.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sourceString = initString(scan);
        char[] upperCaseVowelLetters = {'А', 'О', 'У', 'Ы', 'Э', 'Я', 'Ё', 'Ю', 'И', 'Е'};
        char[] vowelLetters = new char[20];
        int vowel = 0;
        initVowelArray(vowelLetters, upperCaseVowelLetters);
        vowel = amountOfVowel(sourceString, vowelLetters);
        System.out.println("Amount of vowels letters are " + vowel);

    }

    public static String initString(Scanner scan) {
        System.out.print("Enter string: ");
        return scan.nextLine();
    }

    public static void initVowelArray(char[] arrayOfLetter, char[] upperCaseVowel) {
        int j = 0;
        char space = ' ';
        for (int i = 0; i < upperCaseVowel.length; i++) {
            arrayOfLetter[j] = upperCaseVowel[i];
            j++;
            arrayOfLetter[j] = (char) (upperCaseVowel[i] + 32);
            j++;
        }
    }

    public static int amountOfVowel(String sourceString, char[] arrayOfVowelLetters) {
        int amountOfVowel = 0;
        System.out.print("Vowels letters: ");
        for (int i = 0; i < sourceString.length(); i++) {
            if (isVowel(sourceString.charAt(i), arrayOfVowelLetters)) {
                amountOfVowel++;
                System.out.print(sourceString.charAt(i) + " ");
            }
        }
        System.out.println();
        return amountOfVowel;
    }

    public static boolean isVowel(char symbol, char[] arrayOfLetters) {
        for (int i = 0; i < arrayOfLetters.length; i++) {
            if (arrayOfLetters[i] == symbol) {
                return true;
            }
        }
        return false;
    }
}
