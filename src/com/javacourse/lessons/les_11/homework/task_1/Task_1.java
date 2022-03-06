package com.javacourse.lessons.les_11.homework.task_1;

import java.util.Arrays;

public class Task_1 {

    //Есть массив слов. Нужно отфильтвровать его так, чтобы в выходном
    //массиве остались только слова, которые начинаются с w/W
    public static void main(String[] args) {
        String[] arrayOfWord = {"word", "ellipse", "World", "democracy", "Censor", "well"};
        String[] filteredArray = filterWords(arrayOfWord);
        System.out.println(Arrays.toString(filteredArray));
    }

    public static String[] filterWords(String[] sourceArray) {
        String[] filteredArray;
        int counterRequiredWord = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (checkFirstLetter(sourceArray[i], "W", "w")) {
                counterRequiredWord++;
            }
        }
        filteredArray = new String[counterRequiredWord];
        for (int i = 0, j = 0; i < sourceArray.length; i++) {
            if (checkFirstLetter(sourceArray[i], "W", "w")) {
                filteredArray[j] = sourceArray[i];
                j++;
            }
        }
        return filteredArray;
    }

    public static boolean checkFirstLetter(String sourceWord, String... letters) {
        for (int i = 0; i < letters.length; i++) {
            if (sourceWord.charAt(0) == letters[i].charAt(0)) {
                return true;
            }
        }
        return false;
    }

}
