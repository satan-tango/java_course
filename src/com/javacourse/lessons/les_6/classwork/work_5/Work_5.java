package com.javacourse.lessons.les_6.classwork.work_5;

public class Work_5 {

    public static void main(String[] args) {

        String[] arrayOfWords = {"And", "we", "all", "Die", "die", "die", "tonight", "Sanctified",
                "with", "dynamite", "Die", "die", "dynamite", "Halleluja!"};
        String savingWord = "";

        for (int i = 0; i < arrayOfWords.length / 2; i++) {
            savingWord = arrayOfWords[i];
            arrayOfWords[i] = arrayOfWords[arrayOfWords.length - i - 1];
            arrayOfWords[arrayOfWords.length - i - 1] = savingWord;
        }

        for (int i = 0; i < arrayOfWords.length; i++) {
            System.out.print(" " + arrayOfWords[i]);
        }

    }
}
