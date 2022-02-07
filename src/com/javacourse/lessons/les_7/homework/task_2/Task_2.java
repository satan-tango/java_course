package com.javacourse.lessons.les_7.homework.task_2;

public class Task_2 {

    public static void main(String[] args) {
        //Вывести шахматную доску

        String[][] chessDesk = new String[8][8];
        final String blackCell = "B";
        final String whiteCell = "W";
        String colFlag = whiteCell;
        String rowFlag;
        for (int i = 0; i < chessDesk.length; i++) {
            rowFlag = colFlag;
            for (int j = 0; j < chessDesk[i].length; j++) {
                chessDesk[i][j] = rowFlag;
                if (rowFlag.equals(blackCell)) {
                    rowFlag = whiteCell;
                } else {
                    rowFlag = blackCell;
                }
            }
            if (colFlag.equals(whiteCell)) {
                colFlag = blackCell;
            } else {
                colFlag = whiteCell;
            }
        }
        for (String[] col : chessDesk) {
            for (String elem : col) {
                System.out.print(elem+"\t");
            }
            System.out.println();
        }
    }
}
