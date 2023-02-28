package com.gameplayat;

public class Tic_Tac_Toe {
    /*Create a board of char[] of size 10
    and assign empty space to each
    element*/
    public static void main(String[] args) {
        System.out.println("Hello Welcome to tic tac toe!");
        char[][] gameboard = {{' ', ' ', ' ', ' ', ' '}, //ignoring 0th index as
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};
        printgameboard(gameboard);
    }


    public static void printgameboard(char[][] gameboard) {

        for (char[] row : gameboard) {
            for (char c : row){
                System.out.print("  " + c);
            }
            System.out.println("  ");
        }
    }

}
