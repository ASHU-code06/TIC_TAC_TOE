package com.gameplayat;

import java.util.Scanner;

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
        selectletter();
    }


    public static void printgameboard(char[][] gameboard) {

        for (char[] row : gameboard) {
            for (char c : row){
                System.out.print("  " + c);
            }
            System.out.println("  ");
        }
    }
    public static void selectletter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select any letter of your choice either X or O : ");
        String myletter = input.nextLine();
        System.out.println("selected letter is :  "+myletter);
        if(myletter.toLowerCase().equals("x")){
            System.out.println("and Computer will choose O");
        } else if (myletter.toLowerCase().equals("o")) {
            System.out.println("and Computer will choose X");
        }
    }

}
