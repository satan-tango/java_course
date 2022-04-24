package com.javacourse.lessons.les_19.homework.task_1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataBase {

    private Map<String, String> dataBase;
    private File file;
    private String path;

    public DataBase(String path) {
        this.path = path;
        file = new File(path);
        dataBase = new HashMap<>();
        createFile();
        readFile();
    }

    private void createFile() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void readFile() {
        try {
            Scanner scan = new Scanner(file);
            int counter = 0;
            String login = "";
            String password = "";
            while (scan.hasNextLine()) {
                if (counter % 2 == 0) {
                    login = scan.nextLine();
                    counter++;
                } else {
                    password = scan.nextLine();
                    dataBase.put(login, password);
                    counter++;
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getDataBase() {
        return dataBase;
    }

    public void addUser(String login, String password) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(login);
            printWriter.println(password);
            printWriter.close();
        } catch (IOException e) {
        }
        dataBase.put(login, password);
    }
}
