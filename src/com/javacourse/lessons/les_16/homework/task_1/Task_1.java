package com.javacourse.lessons.les_16.homework.task_1;

import java.util.List;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        //Вход на вечеринку только по списку. Есть список имен, пользователь вводит имя,
        //программа проверяет, есть ли он в списке, после чего говорит, может ли он пройти

        Scanner scan = new Scanner(System.in);
        String inputName = initName(scan);
        PartyList partyList = new PartyList();
        initPartyList(partyList);

        if (isContainName(partyList.getNameList(), inputName)) {
            System.out.println("There is name in list, you can go in");
        } else {
            System.out.println("Denied, there is no name in list");
        }
    }

    public static void initPartyList(PartyList partyList) {
        partyList.addName("Petr");
        partyList.addName("Felix");
        partyList.addName("Dick");
        partyList.addName("Arkadii");
        partyList.addName("Janna");
        partyList.addName("Luna");
    }

    public static boolean isContainName(List<String> nameList, String name) {
        for (String nameInList : nameList) {
            if (nameInList.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static String initName(Scanner scan) {
        System.out.print("Input name: ");
        return scan.next();
    }
}
