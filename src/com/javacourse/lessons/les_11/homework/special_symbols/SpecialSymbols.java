package com.javacourse.lessons.les_11.homework.special_symbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//+
public class SpecialSymbols {

    //Содержит ли строка только специальные символы.
    public static void main(String[] args) {
        String str1 = "@$&%!~~~~!!@@";
        String str2 = "@#sd$&%!~";
        System.out.println("Is (" + str1 + ") contain only special symbol: " + isOnlySpecialSymbols(str1));
        System.out.println("Is (" + str2 + ") contain only special symbol: " + isOnlySpecialSymbols(str2));
    }

    public static boolean isOnlySpecialSymbols(String str) {
        Pattern specialSymbols = Pattern.compile("[@#$&%!~]*");
        Matcher matcher = specialSymbols.matcher(str);
        return matcher.matches();
    }
}
