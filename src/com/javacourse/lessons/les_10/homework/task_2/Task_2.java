package com.javacourse.lessons.les_10.homework.task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        // В каждом слове k-ю букву заменить заданным символом.
        // Если k больше длины слова, корректировку не выполнять.

        Scanner scan = new Scanner(System.in);
        String somewhereOverTheRainbow = "Somewhere over the rainbow \n " +
                "Way up high \n " +
                "And the dreams that you dreamed of \n " +
                "Once in a lullaby ii ii iii \n " +
                "Somewhere over the rainbow \n " +
                "Blue birds fly \n " +
                "And the dreams that you dreamed of \n " +
                "Dreams really do come true ooh ooooh \n " +
                "Someday I'll wish upon a star \n " +
                "Wake up where the clouds are far behind me ee ee eeh \n " +
                "Where trouble melts like lemon drops \n " +
                "High above the chimney tops thats where you'll find me oh \n " +
                "Somewhere over the rainbow bluebirds fly \n " +
                "And the dream that you dare to,why, oh why can't I? i iii \n " +
                " \n " +
                "Well I see trees of green and \n " +
                "Red roses too, \n " +
                "I'll watch them bloom for me and you \n " +
                "And I think to myself \n " +
                "What a wonderful world \n " +
                " \n " +
                "Well I see skies of blue and I see clouds of white \n " +
                "And the brightness of day \n " +
                "I like the dark and I think to myself \n " +
                "What a wonderful world \n " +
                "\n" +
                "The colors of the rainbow so pretty in the sky \n " +
                "Are also on the faces of people passing by \n " +
                "I see friends shaking hands \n " +
                "Saying, «How do you do?» \n " +
                "They're really saying, I...I love you \n " +
                "I hear babies cry and I watch them grow, \n " +
                "They'll learn much more \n " +
                "Than we'll know \n " +
                "And I think to myself \n " +
                "What a wonderful world (w)oohoorld \n " +
                " \n " +
                "Someday I'll wish upon a star, \n " +
                "Wake up where the clouds are far behind me \n " +
                "Where trouble melts like lemon drops \n " +
                "High above the chimney top that's where you'll find me \n " +
                "Oh, Somewhere over the rainbow way up high \n " +
                "And the dream that you dare to, why, oh why can't I? I hiii? \n " +
                " \n " +
                "Ooooo oooooo oooooo \n " +
                " \n ";

        String copyString = replaceParticularLetter(somewhereOverTheRainbow, scan);
        System.out.println("Song after replacements: ");
        System.out.println(copyString);

    }

    public static String replaceParticularLetter(String str, Scanner scan) {
        String[] arrayOfWords = str.split(" ");
        int indexToReplace = 0;
        String StringToReplace;
        boolean isCorrectData = false;

        while (!isCorrectData) {
            System.out.print("Enter the number of the symbol to replace: ");
            indexToReplace = scan.nextInt();
            if (indexToReplace < 0) {
                System.out.println("Something went wrong, try again");
                continue;
            }
            isCorrectData = true;
        }

        System.out.print("Enter string to be replaced: ");
        StringToReplace = scan.next();

        str = "";
        String temperString = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() >= indexToReplace) {
                arrayOfWords[i] = replaceCharToString(indexToReplace, arrayOfWords[i], StringToReplace);
            }
            str += arrayOfWords[i] + " ";
        }
        return str;
    }

    public static String replaceCharToString(int index, String str, String strToReplace) {
        String temper = "";
        for (int i = 0; i < str.length(); i++) {
            if (index - 1 == i) {
                temper += strToReplace;
            } else {
                temper += Character.toString(str.charAt(i));

            }
        }
        return temper;
    }
}
